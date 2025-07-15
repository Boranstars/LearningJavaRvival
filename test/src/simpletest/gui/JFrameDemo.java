package simpletest.gui;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
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


        frame.setVisible(true);



    }
}
