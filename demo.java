import javax.swing.*;
import java.awt.*;
public class demo {
public static void main(String[] args) {
JFrame frame = new JFrame("My Window");
frame.setSize(600,400);
frame.setVisible(true);
frame.setLayout(null);
JLabel label1 = new JLabel("Enter Name:");
label1.setBounds(50, 50, 150,40);
label1.setFont(new Font("Monotype Corsiva",
Font.ITALIC, 30));
label1.setForeground(Color.blue);
JTextField tb = new JTextField(20);
tb.setBounds(230, 50, 200, 40);
tb.setFont(new Font("Monotype Corsiva", Font.ITALIC,
30));

tb.setForeground(Color.red);
frame.add(label1);
frame.add(tb);
JButton btn = new JButton("submit");
btn.setFont(new Font("Monotype Corsiva", Font.ITALIC,
30));
btn.setForeground(Color.red);
btn.setBounds(230, 120, 200, 40);
frame.add(btn);
}
}