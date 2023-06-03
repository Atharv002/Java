public import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JTextArea addressArea;
    private JButton submitButton;
    private JTextArea text_are;

    public StudentRegistrationForm() {
        setTitle("Student Course Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        JLabel addressLabel = new JLabel("Address:");
        addressArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(addressArea);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Create the layout
        setLayout(new GridLayout(5, 2, 10, 10));

        // Add components to the layout
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(addressLabel);
        add(scrollPane);
        add(new JLabel()); // Empty label for spacing
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String address = addressArea.getText();

            // Process the form data here
            // ...

            // Display a message dialog with the form data
            String message = "Name: " + name +
                    "\nEmail: " + email +
                    "\nPassword: " + password +
                    "\nAddress: " + address;
            JOptionPane.showMessageDialog(this, message, "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentRegistrationForm());
    }
} {
    
}
