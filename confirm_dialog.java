
import javax.swing.*;

class confirm_dialog {

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(300, 400);
        int value = JOptionPane.showConfirmDialog(frame, "Do you want to delete?");
        switch (value) {
            case 0:
                JOptionPane.showMessageDialog(frame, "Yes");
                break;
            case 1:
                JOptionPane.showMessageDialog(frame, "No");
                break;
            case 2:
                JOptionPane.showMessageDialog(frame, "Cancel");
                break;
        }
    }
}
