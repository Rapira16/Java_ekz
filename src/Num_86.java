import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Num_86 {
    public static void main(String[] args){
        JFrame frame = new JFrame("JFrame");

        frame.setSize(400,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter text: ");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Send");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                JOptionPane.showMessageDialog(frame, "You entered: " + inputText);
            }
        });

        contentPane.add(label);
        contentPane.add(textField);
        contentPane.add(button);
        frame.setVisible(true);
    }
}
