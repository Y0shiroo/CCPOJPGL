import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class FormValidationExample extends JFrame {
    private JTextField phoneNumberField;
    private JTextField emailField;

    public FormValidationExample() {
        setTitle("Form Validation Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel phoneNumberLabel = new JLabel("Phone Number: ");
        phoneNumberField = new JTextField();
        JLabel emailLabel = new JLabel("Email Address: ");
        emailField = new JTextField();
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String phoneNumber = phoneNumberField.getText();
                String email = emailField.getText();
                String errorMessage = "";

                if (!isValidPhoneNumber(phoneNumber)) {
                    if (phoneNumber.length() != 11) {
                        errorMessage += "Invalid phone number. Must have 11 digits.\n";
                    }
                    if (!phoneNumber.startsWith("09")) {
                        errorMessage += "Phone number must start with '09'.\n";
                    }
                }

                if (!isValidEmail(email)) {
                    errorMessage += "Invalid email address. Must be a Gmail address (e.g., example@gmail.com).\n";
                    if (!email.contains("@") || !email.endsWith("@gmail.com")) {
                        errorMessage += "Email address should have a username before '@gmail.com'.\n";
                    }
                }

                if (errorMessage.isEmpty()) {
                    JOptionPane.showMessageDialog(FormValidationExample.this,
                            "Submitted successfully!",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(FormValidationExample.this,
                            errorMessage,
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(phoneNumberLabel);
        panel.add(phoneNumberField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(submitButton);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);

        phoneNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!((c >= '0' && c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    evt.consume();
                }
                if (phoneNumberField.getText().length() >= 11) {
                    evt.consume();
                }
            }
        });
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("09\\d{9}");
    }

    private boolean isValidEmail(String email) {
        return email.matches("^.+@gmail\\.com$");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FormValidationExample().setVisible(true);
            }
        });
    }
}
