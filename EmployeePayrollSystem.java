public import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeePayrollSystem extends JFrame implements ActionListener {

    private JTextField nameField, salaryField;
    private JRadioButton maleRadio, femaleRadio;
    private JComboBox<String> departmentComboBox;
    private JCheckBox healthInsuranceCheck, dentalInsuranceCheck, retirementPlanCheck;
    private JSlider experienceSlider;

    public EmployeePayrollSystem() {
        setTitle("Employee Payroll System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2));

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel departmentLabel = new JLabel("Department:");
        JLabel salaryLabel = new JLabel("Salary:");
        JLabel benefitsLabel = new JLabel("Benefits:");
        JLabel experienceLabel = new JLabel("Experience:");

        // Text Fields
        nameField = new JTextField();

        // Radio Buttons
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Combo Box
        departmentComboBox = new JComboBox<>(new String[]{"IT", "Finance", "HR", "Sales"});

        // Text Field for Salary
        salaryField = new JTextField();

        // Check Boxes
        healthInsuranceCheck = new JCheckBox("Health Insurance");
        dentalInsuranceCheck = new JCheckBox("Dental Insurance");
        retirementPlanCheck = new JCheckBox("Retirement Plan");

        // Slider for Experience
        experienceSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
        experienceSlider.setMajorTickSpacing(1);
        experienceSlider.setPaintTicks(true);
        experienceSlider.setPaintLabels(true);

        // Button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(genderLabel);
        add(maleRadio);
        add(new JLabel()); // Empty label for formatting
        add(femaleRadio);
        add(departmentLabel);
        add(departmentComboBox);
        add(salaryLabel);
        add(salaryField);
        add(benefitsLabel);
        add(healthInsuranceCheck);
        add(new JLabel()); // Empty label for formatting
        add(dentalInsuranceCheck);
        add(new JLabel()); // Empty label for formatting
        add(retirementPlanCheck);
        add(experienceLabel);
        add(experienceSlider);
        add(new JLabel()); // Empty label for formatting
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")) {
            String name = nameField.getText();
            String gender = maleRadio.isSelected() ? "Male" : "Female";
            String department = (String) departmentComboBox.getSelectedItem();
            double salary = Double.parseDouble(salaryField.getText());
            boolean hasHealthInsurance = healthInsuranceCheck.isSelected();
            boolean hasDentalInsurance = dentalInsuranceCheck.isSelected();
            boolean hasRetirementPlan = retirementPlanCheck.isSelected();
            int experience = experienceSlider.getValue();

            // Process the employee data (e.g., calculate salary, store in database, etc.)

            // Display a confirmation dialog
            JOptionPane.showMessageDialog(this, "Employee data saved successfully!",
                    "Success", JOptionPane.INFORMATION_MESSAGE);

            // Clear the form fields after saving data
            nameField.setText("");
            maleRadio.setSelected(true);
            departmentComboBox.setSelectedIndex(0);
            salaryField.setText("");
            healthInsuranceCheck.setSelected(false);
            dentalInsuranceCheck.setSelected(false);
            retirementPlanCheck.setSelected(false);
            experienceSlider.setValue(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EmployeePayrollSystem();
            }
        });
    }
} {
    
}
