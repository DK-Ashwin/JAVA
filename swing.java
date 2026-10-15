import java.awt.FlowLayout;
import javax.swing.JFrame;

public class swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    }
}