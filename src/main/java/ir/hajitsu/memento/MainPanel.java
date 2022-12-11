package ir.hajitsu.memento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainPanel extends JPanel {

    private JLabel jLabel;
    private JTextField jTextField;
    private JTextFieldHistory jTextFieldHistory;
    private JButton jButton;

    public MainPanel() {
        jLabel = new JLabel("Enter your name: (Press CTRL + Z to undo)");
        jTextField = new JTextField(20);
        jTextFieldHistory = new JTextFieldHistory(jTextField);
        jButton = new JButton("Save");
        setLayout(new FlowLayout());
        add(jLabel);
        add(jTextField);
        add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextFieldHistory.save();
            }
        });
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_Z) && (e.isControlDown())) {
                    jTextFieldHistory.undo();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Memnto Design Pattern");
        jFrame.setSize(800, 300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(new MainPanel());
        jFrame.setVisible(true);
    }
}
