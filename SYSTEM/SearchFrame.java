import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;

public class SearchFrame {

    private JFrame frame;
    private JTextField searchField;
    private JTable table;
    private DefaultTableModel model;
    private TableRowSorter<DefaultTableModel> sorter;
    private List<String[]> originalData;
    private ApplicantFrame applicantFrame;

    private static final String FILE_PATH = "data.txt";

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SearchFrame window = new SearchFrame();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SearchFrame() {
        initialize();
        loadDataFromFile();
        originalData = getDataFromModel();
        applicantFrame = new ApplicantFrame();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 513, 442);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 463, 310);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblSearch = new JLabel("Search Position Code:");
        lblSearch.setHorizontalAlignment(SwingConstants.RIGHT);
        lblSearch.setBounds(10, 11, 140, 14);
        panel.add(lblSearch);

        searchField = new JTextField();
        searchField.setBounds(160, 8, 140, 20);
        panel.add(searchField);
        searchField.setColumns(10);

        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(310, 7, 89, 23);
        panel.add(btnSearch);

        JButton btnApply = new JButton("Apply");
        btnApply.setBounds(177, 334, 89, 23);
        frame.getContentPane().add(btnApply);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 36, 443, 248);
        panel.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        model = new DefaultTableModel();
        table.setModel(model);
        table.setEnabled(true);
        table.setFocusable(false);
        table.setRowSelectionAllowed(true);
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.setDefaultEditor(Object.class, null);
        Object[] column = { "Position Code" };
        model.setColumnIdentifiers(column);

        sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchQuery = searchField.getText().trim();
                if (searchQuery.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter a position code to search.", "Empty Search", JOptionPane.WARNING_MESSAGE);
                } else {
                    searchPositionCode(searchQuery);
                }
            }
        });

        btnApply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(frame, "Please select a position code to apply.", "No Selection", JOptionPane.WARNING_MESSAGE);
                } else {
                    String positionCode = (String) table.getValueAt(selectedRow, 0);
                    applicantFrame.incrementApplicants(positionCode);
                    applicantFrame.saveDataToFile();
                    JOptionPane.showMessageDialog(frame, "You have successfully applied for position code: " + positionCode, "Application Submitted", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    private void loadDataFromFile() {
        try {
            File file = new File(FILE_PATH);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    if (data.length > 0) {
                        model.addRow(data);
                    }
                }
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String[]> getDataFromModel() {
        List<String[]> data = new ArrayList<>();
        for (int i = 0; i < model.getRowCount(); i++) {
            String[] rowData = new String[model.getColumnCount()];
            for (int j = 0; j < model.getColumnCount(); j++) {
                rowData[j] = (String) model.getValueAt(i, j);
            }
            data.add(rowData);
        }
        return data;
    }

    private void searchPositionCode(String query) {
        RowFilter<DefaultTableModel, Object> rf = null;
        try {
            rf = RowFilter.regexFilter(query, 0);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorter.setRowFilter(rf);
    }
}
