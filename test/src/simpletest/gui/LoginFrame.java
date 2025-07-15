package simpletest.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
        public  LoginFrame() {
            this.setTitle("Login Frame");
            this.setLayout(null);
            this.setSize(800, 600);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            initFrame();
        }

        private void initFrame() {
            JPanel panel = new JPanel();
            panel.setBounds(0, 0, 800, 600);
            this.add(panel);

            JButton button = new JButton("Login");
            button.setBounds(100, 100, 100, 100);
            button.addActionListener(this);
            panel.add(button);
        }

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Login Frame");
    }
}
