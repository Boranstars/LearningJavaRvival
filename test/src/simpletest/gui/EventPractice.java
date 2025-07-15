package simpletest.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventPractice {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 100);
        panel.add(button);
        button.addActionListener(new MyActionListener(frame));
        frame.setVisible(true);
    }
}

/**
 * 自定义动作监听类
 */
class MyActionListener implements ActionListener {
    private final JFrame frame;
    public MyActionListener(JFrame frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "Click Me! From MyActionListener");
    }
}