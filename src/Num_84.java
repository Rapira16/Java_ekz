import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Model{
    private int clickCount;
    public Model(){
        this.clickCount = 0;
    }
    public void incrementClickCount(){
        clickCount++;
    }
    public int getClickCount(){
        return clickCount;
    }
}

class View{
    private JFrame frame;
    private JButton button;
    private JLabel label;
    public View(){
        frame = new JFrame("Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        button = new JButton("Click me!");
        label = new JLabel("0");

        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }
    public void setClickCount(int count){
        label.setText("Clicks: " + count);
    }
    public void addButtonListener(ActionListener listener){
        button.addActionListener(listener);
    }
}

class Controller{
    private Model model;
    private View view;
    public Controller(){
        model = new Model();
        view = new View();
        view.addButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.incrementClickCount();
                view.setClickCount(model.getClickCount());
            }
        });
    }
}
public class Num_84 {
    public static void main(String[] args){
        new Controller();
    }
}
