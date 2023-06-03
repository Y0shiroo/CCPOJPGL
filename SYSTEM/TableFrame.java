import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class TableFrame {

    private JFrame frame;
    private JTextField TFposcode;
    private JTextField TFjobtitle;
    private JTextField TFrespon;
    private JTextField TFsalary;
    private JTable Vartable;
    private JScrollPane scrollPane;
    DefaultTableModel model;
    private JTable otherTable;

    private static final String FILE_PATH = "data.txt";

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OtherFrame otherFrame = new OtherFrame();
                    TableFrame window = new TableFrame(otherFrame.getTable());
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TableFrame(JTable otherTable) {
        this.otherTable = otherTable;
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 700, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(192, 192, 192));
        panel.setForeground(new Color(0, 0, 0));
        panel.setBounds(0, 0, 686, 513);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblPosCode = new JLabel("Position Code:");
        lblPosCode.setHorizontalAlignment(SwingConstants.CENTER);
        lblPosCode.setBounds(10, 57, 105, 35);
        panel.add(lblPosCode);

        JLabel lblJobTitle = new JLabel("Job Title:");
        lblJobTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblJobTitle.setBounds(10, 102, 105, 35);
        panel.add(lblJobTitle);

        JLabel lblResponsibilities = new JLabel(" Responsibilities:");
        lblResponsibilities.setHorizontalAlignment(SwingConstants.CENTER);
        lblResponsibilities.setBounds(10, 147, 105, 35);
        panel.add(lblResponsibilities);

        JLabel lblSalary = new JLabel("Salary:");
        lblSalary.setHorizontalAlignment(SwingConstants.CENTER);
        lblSalary.setBounds(10, 192, 105, 35);
        panel.add(lblSalary);

        TFposcode = new JTextField();
        TFposcode.setBounds(139, 65, 134, 19);
        panel.add(TFposcode);
        TFposcode.setColumns(10);

        TFjobtitle = new JTextField();
        TFjobtitle.setColumns(10);
        TFjobtitle.setBounds(139, 110, 134, 19);
        panel.add(TFjobtitle);

        TFrespon = new JTextField();
        TFrespon.setColumns(10);
        TFrespon.setBounds(139, 155, 134, 19);
        panel.add(TFrespon);

        TFsalary = new JTextField();
        TFsalary.setColumns(10);
        TFsalary.setBounds(139, 200, 134, 19);
        panel.add(TFsalary);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(296, 40, 360, 430);
        panel.add(scrollPane);

        Vartable = new JTable();
        Vartable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int i = Vartable.getSelectedRow();
                TFposcode.setText(model.getValueAt(i, 0).toString());
                TFjobtitle.setText(model.getValueAt(i, 1).toString());
                TFrespon.setText(model.getValueAt(i, 2).toString());
                TFsalary.setText(model.getValueAt(i, 3).toString());
            }
        });
        Vartable.setBackground(new Color(165, 216, 220));
        model = new DefaultTableModel();
        Vartable.getTableHeader().setReorderingAllowed(false);
        Vartable.getTableHeader().setResizingAllowed(false);
        Object[] column = {"Position Code", "Job Title", "Responsibilities", "Salary"};
        final Object[] row = new Object[4];
        model.setColumnIdentifiers(column);
        Vartable.setModel(model);
        scrollPane.setViewportView(Vartable);
        

        JButton btnAdd = new JButton("ADD");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (TFposcode.getText().equals("") || TFjobtitle.getText().equals("") || TFrespon.getText().equals("")
                        || TFsalary.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Complete Filling Out The Information");
                } else {
                    row[0] = TFposcode.getText();
                    row[1] = TFjobtitle.getText();
                    row[2] = TFrespon.getText();
                    row[3] = TFsalary.getText();
                    model.addRow(row);
                    TFposcode.setText("");
                    TFjobtitle.setText("");
                    TFrespon.setText("");
                    TFsalary.setText("");

                    // Add row to otherTable
                    DefaultTableModel otherModel = (DefaultTableModel) otherTable.getModel();
                    otherModel.addRow(row);

                    // Save data to file
                    saveDataToFile();
                }
            }
        });
        btnAdd.setBounds(46, 284, 90, 35);
        panel.add(btnAdd);

        JButton btnUpdate = new JButton("UPDATE");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = Vartable.getSelectedRow();
                if (i >= 0) {
                    if (TFposcode.getText().equals("") || TFjobtitle.getText().equals("") || TFrespon.getText().equals("")
                            || TFsalary.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Please Complete Filling Out The Information");
                    } else {
                        model.setValueAt(TFposcode.getText(), i, 0);
                        model.setValueAt(TFjobtitle.getText(), i, 1);
                        model.setValueAt(TFrespon.getText(), i, 2);
                        model.setValueAt(TFsalary.getText(), i, 3);
                        JOptionPane.showMessageDialog(null, "Updated Successfully!");
                        TFposcode.setText("");
                        TFjobtitle.setText("");
                        TFrespon.setText("");
                        TFsalary.setText("");

                        // Update (other table)
                        DefaultTableModel otherModel = (DefaultTableModel) otherTable.getModel();
                        otherModel.setValueAt(TFposcode.getText(), i, 0);
                        otherModel.setValueAt(TFjobtitle.getText(), i, 1);
                        otherModel.setValueAt(TFrespon.getText(), i, 2);
                        otherModel.setValueAt(TFsalary.getText(), i, 3);

                        // Save data to file
                        saveDataToFile();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Select A Row To Update");
                }
            }
        });

        btnUpdate.setBounds(169, 284, 90, 35);
        panel.add(btnUpdate);

        JButton btnDelete = new JButton("DELETE");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = Vartable.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i);
                    JOptionPane.showMessageDialog(null, "Deleted Successfully!");
                    TFposcode.setText("");
                    TFjobtitle.setText("");
                    TFrespon.setText("");
                    TFsalary.setText("");

                    // Delete (other table)
                    DefaultTableModel otherModel = (DefaultTableModel) otherTable.getModel();
                    otherModel.removeRow(i);

                    // Save data to file
                    saveDataToFile();
                } else {
                    JOptionPane.showMessageDialog(null, "Select A Row To Delete");
                }
            }
        });
        btnDelete.setBounds(46, 341, 90, 35);
        panel.add(btnDelete);

        scrollPane = new JScrollPane();
        scrollPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = Vartable.getSelectedRow();
                TFposcode.setText(model.getValueAt(i, 0).toString());
                TFjobtitle.setText(model.getValueAt(i, 1).toString());
                TFrespon.setText(model.getValueAt(i, 2).toString());
                TFsalary.setText(model.getValueAt(i, 3).toString());
            }
        });
        scrollPane.setBounds(296, 40, 360, 430);
        panel.add(scrollPane);

        JButton btnClear = new JButton("CLEAR");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TFposcode.setText("");
                TFjobtitle.setText("");
                TFrespon.setText("");
                TFsalary.setText("");
            }
        });
        btnClear.setBounds(169, 341, 90, 35);
        panel.add(btnClear);

        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OtherFrame OTF = new OtherFrame();
                OTF.setVisible(true);
                frame.setVisible(false);
                frame.dispose();

                // Save data to file
                saveDataToFile();
            }
        });
        btnNext.setBounds(114, 397, 90, 35);
        panel.add(btnNext);

        // Load data from file
        loadDataFromFile();
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
                    DefaultTableModel otherModel = (DefaultTableModel) otherTable.getModel();
                    otherModel.addRow(data);
                }
                br.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveDataToFile() {
        try {
            File file = new File("data.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    bw.write(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1) {
                        bw.write(",");
                    }
                }
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
