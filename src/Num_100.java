import javax.swing.*;
import java.awt.event.*;
public class Num_100 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Keyboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField(20);
        JLabel label = new JLabel("Press key: ");

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                label.setText(KeyEvent.getKeyText(e.getKeyCode()));
            }
            @Override
            public void keyReleased(KeyEvent e) {
                label.setText(KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("" + e.getKeyChar());
            }
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }
}
