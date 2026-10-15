
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class dialog {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, "Hello, Welcome to Swing");
    }
}
