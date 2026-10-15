
import java.awt.event.*;
import javax.swing.*;

public class swing_greeting {

    public static void main(String[] args) {
        JFrame f = new JFrame("Greeting");
        JLabel name = new JLabel("Enter your name:");
        JTextField t = new JTextField();
        JButton greet = new JButton("Greet");
        JLabel message = new JLabel("");
        name.setBounds(50, 30, 200, 30);
        t.setBounds(50, 70, 200, 30);
        greet.setBounds(50, 115, 100, 30);
        message.setBounds(50, 160, 300, 30);

        greet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t.getText().trim();
                if (name.isEmpty()) {
                    message.setText("Please enter your name.");
                } else {
                    message.setText("Hello, " + name + "! Welcome to Java Swing.");
                }
            }
        });
        f.add(name);
        f.add(t);
        f.add(greet);
        f.add(message);
        f.setSize(380, 260);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
