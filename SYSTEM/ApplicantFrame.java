import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ApplicantFrame {

    private JFrame frame;
    private Map<String, Integer> applicantCounts;
    private FileWriter fileWriter;

    public ApplicantFrame() {
        applicantCounts = new HashMap<>();
        initialize();
        initializeFileWriter();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 300, 250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 264, 192);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblTitle = new JLabel("Applicant Frame");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setBounds(10, 11, 244, 31);
        panel.add(lblTitle);
        frame.setVisible(true);
    }

    private void initializeFileWriter() {
        try {
            fileWriter = new FileWriter("applicant_data.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void incrementApplicants(String positionCode) {
        int count = applicantCounts.getOrDefault(positionCode, 0);
        count++;
        applicantCounts.put(positionCode, count);
        updateApplicantCountLabel();
    }

    private void updateApplicantCountLabel() {
        frame.getContentPane().removeAll();

        int y = 55;
        for (Map.Entry<String, Integer> entry : applicantCounts.entrySet()) {
            String positionCode = entry.getKey();
            int count = entry.getValue();

            JLabel label = new JLabel(positionCode + ": " + count + " applicants");
            label.setFont(new Font("Arial", Font.PLAIN, 14));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setBounds(10, y, 244, 23);
            frame.getContentPane().add(label);

            y += 31;
        }
        frame.revalidate();
        frame.repaint();
    }

    public void saveDataToFile() {
        try {
            FileWriter fw = new FileWriter("applicant_data.txt");
            for (Map.Entry<String, Integer> entry : applicantCounts.entrySet()) {
                String positionCode = entry.getKey();
                int count = entry.getValue();

                fw.write(positionCode + "," + count + "\n");
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
