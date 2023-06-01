import javax.swing.*;

public class GUI_demo extends JFrame {
    
    public GUI_demo() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Swing Components");
        setSize(500, 500);
        
        JPanel panel = new JPanel(); // JPanel
        panel.setLayout(null);
        
        JCheckBox checkBox = new JCheckBox("Checkbox"); // JCheckBox
        checkBox.setBounds(20, 20, 100, 30);
        panel.add(checkBox);
        
        JRadioButton radioButton = new JRadioButton("RadioButton"); //JRadioButton
        radioButton.setBounds(20, 60, 100, 30);
        panel.add(radioButton);
        
        JLabel label = new JLabel("Enter Name in this label:"); //JLabel
        label.setBounds(20, 100, 100, 30);
        panel.add(label);
        
        JTextField textField = new JTextField("This is a TextField!"); //JTextField
        textField.setBounds(130, 100, 150, 30);
        panel.add(textField);
        
        JTextArea textArea = new JTextArea(); //JTextArea
        textArea.setBounds(20, 140, 260, 80);
        panel.add(textArea);

        String[] options = {"Option A", "Option B", "Option C"}; //JComboBox
        JComboBox<String> comboBox = new JComboBox<String>(options);
        comboBox.setBounds(20, 230, 100, 30);
        panel.add(comboBox);
        
        JPasswordField passwordField = new JPasswordField(); //JPasswordField
        passwordField.setBounds(130, 230, 150, 30);
        panel.add(passwordField);
        
        add(panel); // Add the main panel to the JFrame
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUI_demo();
    }
}


