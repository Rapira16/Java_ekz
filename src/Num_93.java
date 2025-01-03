import javax.swing.*;
import java.awt.*;
public class Num_93 {
    public static void main(String[] args){
        JFrame frame = new JFrame("GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3,2));

        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameField = new JTextField();
        JLabel ageLabel = new JLabel("Age: ");
        JTextField ageField = new JTextField();
        JButton submitButton = new JButton("Send");
        JButton cancelButton = new JButton("Cancel");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(submitButton);
        frame.add(cancelButton);

        frame.setVisible(true);
    }
}
