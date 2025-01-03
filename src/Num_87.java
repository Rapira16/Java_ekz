import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Num_87 {
    public static void main(String[] args){
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JLabel("Enter text: "));
        JTextField textField = new JTextField(15);
        panel1.add(textField);
        JButton button1 = new JButton("Send");
        panel1.add(button1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,2));
        panel2.add(new JLabel("Name: "));
        panel2.add(new JTextField(10));
        panel2.add(new JLabel("Age: "));
        panel2.add(new JTextField(10));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                JOptionPane.showMessageDialog(frame, "Entered " + inputText);
            }
        });

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}