import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class OtherFrame extends JFrame {

    private JTable otherTable;
    private DefaultTableModel model;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OtherFrame window = new OtherFrame();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public OtherFrame() {
        initialize();
        loadDataFromFile();
    }

    public JTable getTable() {
        return otherTable;
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 799, 714);
        getContentPane().setLayout(null);

        model = new DefaultTableModel();
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(158, 75, 412, 491);
        getContentPane().add(scrollPane);
        otherTable = new JTable(model);
        scrollPane.setViewportView(otherTable);
        otherTable.setModel(model);
        otherTable.setEnabled(false);
        otherTable.setFocusable(false);
        otherTable.setRowSelectionAllowed(false);
        otherTable.getTableHeader().setReorderingAllowed(false);
        otherTable.getTableHeader().setResizingAllowed(false);
        Object[] column = { "Position Code", "Job Title", "Responsibilities", "Salary" };
        model.setColumnIdentifiers(column);
        final Object[] row = new Object[4];
        model.setColumnIdentifiers(column);
        scrollPane.setViewportView(otherTable);
    }

    private void loadDataFromFile() {
        try {
            File file = new File("data.txt");
            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    model.addRow(data);
                }
                br.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
