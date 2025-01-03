import javax.swing.*;
import java.awt.*;
public class Num_89 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Пример FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        JButton button3 = new JButton("Кнопка 3");
        JButton button4 = new JButton("Кнопка 4");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
