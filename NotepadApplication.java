public import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NotepadApplication extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JPopupMenu popupMenu;
    private JCheckBoxMenuItem wordWrapMenuItem;
    private JRadioButtonMenuItem lightThemeMenuItem, darkThemeMenuItem;

    public NotepadApplication() {
        setTitle("Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Text Area
        textArea = new JTextArea();

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        // File Menu Items
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(this);
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(this);
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(this);
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(this);

        // Edit Menu
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);

        // Edit Menu Items
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        cutMenuItem.addActionListener(this);
        cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem copyMenuItem = new JMenuItem("Copy");
        copyMenuItem.addActionListener(this);
        copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        pasteMenuItem.addActionListener(this);
        pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));

        // View Menu
        JMenu viewMenu = new JMenu("View");
        viewMenu.setMnemonic(KeyEvent.VK_V);

        // View Menu Items
        wordWrapMenuItem = new JCheckBoxMenuItem("Word Wrap");
        wordWrapMenuItem.addActionListener(this);

        // Theme Submenu
        JMenu themeSubMenu = new JMenu("Theme");

        ButtonGroup themeButtonGroup = new ButtonGroup();
        lightThemeMenuItem = new JRadioButtonMenuItem("Light");
        lightThemeMenuItem.addActionListener(this);
        darkThemeMenuItem = new JRadioButtonMenuItem("Dark");
        darkThemeMenuItem.addActionListener(this);

        themeButtonGroup.add(lightThemeMenuItem);
        themeButtonGroup.add(darkThemeMenuItem);

        themeSubMenu.add(lightThemeMenuItem);
        themeSubMenu.add(darkThemeMenuItem);

        viewMenu.add(wordWrapMenuItem);
        viewMenu.add(themeSubMenu);

        // Popup Menu
        popupMenu = new JPopupMenu();
        JMenuItem cutPopupMenuItem = new JMenuItem("Cut");
        cutPopupMenuItem.addActionListener(this);
        popupMenu.add(cutPopupMenuItem);
        JMenuItem copyPopupMenuItem = new JMenuItem("Copy");
        copyPopupMenuItem.addActionListener(this);
        popupMenu.add(copyPopupMenuItem);
        JMenuItem pastePopupMenuItem = new JMenuItem("Paste");
        pastePopupMenuItem.addActionListener(this);
        popupMenu.add(pastePopupMenuItem);

        // Design Menu
        JMenu designMenu = new JMenu("Design");
        designMenu.setMnemonic(KeyEvent.VK_D);
        designMenu.setEnabled(false);

        // Tool Bar
        JToolBar toolBar = new JToolBar();
        JButton cutToolbarButton = new JButton(new ImageIcon("cut_icon.png"));
        cutToolbarButton.addActionListener(this);
        JButton copyToolbarButton = new JButton(new ImageIcon("copy_icon.png"));
        copyToolbarButton.addActionListener(this);
        JButton pasteToolbarButton = new JButton(new ImageIcon("paste_icon.png"));
        pasteToolbarButton.addActionListener(this);
        toolBar.add(cutToolbarButton);
        toolBar.add(copyToolbarButton);
        toolBar.add(pasteToolbarButton);

        // Tool Tips
        cutToolbarButton.setToolTipText("Cut");
        copyToolbarButton.setToolTipText("Copy");
        pasteToolbarButton.setToolTipText("Paste");

        // Add components to the frame
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar.add(editMenu);
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        menuBar.add(viewMenu);
        viewMenu.add(wordWrapMenuItem);
        viewMenu.add(themeSubMenu);

        menuBar.add(designMenu);

        add(toolBar, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popupMenu.show(textArea, e.getX(), e.getY());
                }
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("New")) {
            textArea.setText("");
        } else if (e.getActionCommand().equals("Open")) {
            // Implement open file functionality
        } else if (e.getActionCommand().equals("Save")) {
            // Implement save file functionality
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        } else if (e.getActionCommand().equals("Cut")) {
            textArea.cut();
        } else if (e.getActionCommand().equals("Copy")) {
            textArea.copy();
        } else if (e.getActionCommand().equals("Paste")) {
            textArea.paste();
        } else if (e.getSource() == wordWrapMenuItem) {
            textArea.setLineWrap(wordWrapMenuItem.isSelected());
        } else if (e.getSource() == lightThemeMenuItem) {
            // Implement light theme functionality
        } else if (e.getSource() == darkThemeMenuItem) {
            // Implement dark theme functionality
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NotepadApplication();
            }
        });
    }
} {
    
}
