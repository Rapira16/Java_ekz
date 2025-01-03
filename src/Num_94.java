import javax.swing.*;

public class Num_94 {
    public static void main(String[] args){
        JFrame frame = new JFrame("BoxLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Enter text");
        JTextField textField = new JTextField(15);
        JButton submitButton = new JButton("Send");
        JButton cancelButton = new JButton("Cancel");

        panel.add(label);
        panel.add(textField);
        panel.add(Box.createVerticalStrut(10)); // Промежуток между текстовым полем и кнопками
        panel.add(submitButton);
        panel.add(cancelButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
