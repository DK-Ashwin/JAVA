
import javax.swing.*;
import java.awt.event.*;

public class swing_gradecalc {

    public static void main(String[] args) {
        JFrame f = new JFrame("Grade Calculator");
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField();
        JLabel marksLabel = new JLabel("Marks:");
        JTextField marksField = new JTextField();
        JButton button = new JButton("Calculate Grade");
        JLabel result = new JLabel("");
        nameLabel.setBounds(30, 30, 100, 30);
        nameField.setBounds(140, 30, 180, 30);
        marksLabel.setBounds(30, 80, 100, 30);
        marksField.setBounds(140, 80, 180, 30);
        button.setBounds(30, 130, 150, 30);
        result.setBounds(30, 180, 350, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText();
                    int marks = Integer.parseInt(marksField.getText());

                    if (marks < 0 || marks > 100) {
                        result.setText("Marks must be between 0 and 100");
                        return;
                    }
                    String grade;
                    if (marks >= 90) {
                        grade = "A";
                    } else if (marks >= 75) {
                        grade = "B";
                    } else if (marks >= 60) {
                        grade = "C";
                    } else if (marks >= 50) {
                        grade = "D";
                    } else {
                        grade = "F";
                    }
                    result.setText(name + " - Grade: " + grade);
                } catch (NumberFormatException ex) {
                    result.setText("Please enter valid marks (a whole number)");
                }
            }
        });
        f.add(nameLabel);
        f.add(nameField);
        f.add(marksLabel);
        f.add(marksField);
        f.add(button);
        f.add(result);

        f.setSize(420, 290);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
