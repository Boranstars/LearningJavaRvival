package simpletest.gui;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EventDemo {
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
        button.addActionListener((event)-> JOptionPane.showMessageDialog(frame, "Click Me!"));
        frame.addKeyListener(
                new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        int key = e.getKeyCode();
                        if (key == KeyEvent.VK_ENTER) {
                            button.doClick();
                            System.out.println(button.getText());

                        }
                    }
                }
        );
        frame.setVisible(true);
        frame.requestFocus();
    }
}
