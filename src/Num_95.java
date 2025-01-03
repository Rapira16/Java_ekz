import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class Num_95 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Border");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(2,2));

        JPanel panel1 = new JPanel();
        panel1.setBorder(new LineBorder(Color.BLUE, 2));
        panel1.add(new JLabel("LineBorder"));

        JPanel panel2 = new JPanel();
        panel2.setBorder(new EtchedBorder());
        panel2.add(new JLabel("EtchedBorder"));

        JPanel panel3 = new JPanel();
        panel3.setBorder(new TitledBorder("Heading"));
        panel3.add(new JLabel("TitleBorder"));

        JPanel panel4 = new JPanel();
        panel4.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel4.add(new JLabel("EmptyBorder"));

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.setVisible(true);

    }
}
