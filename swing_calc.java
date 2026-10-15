
import java.awt.event.*;
import javax.swing.*;

public class swing_calc {

    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JLabel l1 = new JLabel("Enter First Number:");
        JLabel l2 = new JLabel("Enter Second Number:");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton add = new JButton("ADD");
        JButton sub = new JButton("SUBTRACT");
        JButton mul = new JButton("MULTIPLY");
        JButton div = new JButton("DIVIDE");
        JLabel result = new JLabel("RESULT: ");
        l1.setBounds(30, 30, 110, 30);
        t1.setBounds(150, 30, 150, 30);
        l2.setBounds(30, 80, 110, 30);
        t2.setBounds(150, 80, 150, 30);
        add.setBounds(350, 30, 100, 30);
        sub.setBounds(350, 70, 100, 30);
        mul.setBounds(350, 110, 100, 30);
        div.setBounds(350, 150, 100, 30);
        result.setBounds(30, 130, 1000, 30);
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(t1.getText());
                    double b = Double.parseDouble(t2.getText());
                    double res = 0;

                    if (e.getSource() == add) {
                        res = a + b;
                    } else if (e.getSource() == sub) {
                        res = a - b;
                    } else if (e.getSource() == mul) {
                        res = a * b;
                    } else if (e.getSource() == div) {
                        if (b == 0) {
                            JOptionPane.showMessageDialog(f, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                            result.setText("Result: Error");
                            return;
                        }
                        res = a / b;
                    }
                    result.setText("Result: " + res);
                } catch (NumberFormatException ef) {
                    JOptionPane.showMessageDialog(f, "Please enter valid numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    result.setText("Result: Error");
                }
            }
        };

        add.addActionListener(listener);
        sub.addActionListener(listener);
        mul.addActionListener(listener);
        div.addActionListener(listener);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(result);

        f.setSize(450, 290);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
