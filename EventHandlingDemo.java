import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingDemo implements ActionListener, MouseListener, MouseMotionListener {
    private JFrame frame;
    private JButton button;
    private JLabel label;

    public EventHandlingDemo() {
        // create the main frame
        frame = new JFrame("Event Handling Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // create a button
        button = new JButton("Click me!");
        button.addActionListener(this);

        // create a label
        label = new JLabel("Move your mouse over me!");

        // add mouse listeners to the label
        label.addMouseListener(this);
        label.addMouseMotionListener(this);

        // add the button and label to the frame
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(button);
        frame.getContentPane().add(label);

        // display the frame
        frame.setVisible(true);
    }

    // implementation of ActionListener interface
    public void actionPerformed(ActionEvent e) {
        // handle button click event
        JOptionPane.showMessageDialog(frame, "You clicked the button!");
    }

    // implementation of MouseListener interface
    public void mouseClicked(MouseEvent e) {
        // handle mouse click event on the label
        JOptionPane.showMessageDialog(frame, "You clicked the label!");
    }

    public void mouseEntered(MouseEvent e) {
        // handle mouse enter event on the label
        label.setText("Mouse entered!");
    }

    public void mouseExited(MouseEvent e) {
        // handle mouse exit event on the label
        label.setText("Mouse exited!");
    }

    public void mousePressed(MouseEvent e) {
        // handle mouse press event on the label
        label.setText("Mouse pressed!");
    }

    public void mouseReleased(MouseEvent e) {
        // handle mouse release event on the label
        label.setText("Mouse released!");
    }

    // implementation of MouseMotionListener interface
    public void mouseDragged(MouseEvent e) {
        // handle mouse drag event on the label
        label.setText("Mouse dragged!");
    }

    public void mouseMoved(MouseEvent e) {
        // handle mouse move event on the label
        label.setText("Mouse moved!");
    }

    public static void main(String[] args) {
        new EventHandlingDemo();
    }
}
