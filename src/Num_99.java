import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Num_99 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Mouse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        JLabel label = new JLabel("Move mouse and click");

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                label.setText(e.getX() + ", " + e.getY());
            }
            @Override
            public void mouseReleased(MouseEvent e){
                label.setText(e.getX() + ", " + e.getY());
            }
            @Override
            public void mouseEntered(MouseEvent e){
                panel.setBackground(Color.YELLOW);
            }
            @Override
            public void mouseExited(MouseEvent e){
                panel.setBackground(Color.LIGHT_GRAY);
            }
        });
        panel.addMouseMotionListener(new MouseMotionAdapter(){
           @Override
           public void mouseMoved(MouseEvent e){
               label.setText(e.getX() + ": " + e.getY());
           }
           @Override
            public void mouseDragged(MouseEvent e){
               label.setText(e.getX() + ": " + e.getY());
           }
        });

        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
}
