import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Num_82 {
    public static void main(String[] args){
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter text: ");
        frame.add(label);

        JTextField textField = new JTextField(20);
        frame.add(textField);

        JButton button = new JButton("Press");
        frame.add(button);

        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        String[] listItems = {"Element 1", "Element 2", "Element 3"};
        JList<String> list = new JList<>(listItems);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(list);
        listScrollPane.setPreferredSize(new Dimension(100, 60));
        frame.add(listScrollPane);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                String selectedOption = (String) comboBox.getSelectedItem();
                String selectedListItem = list.getSelectedValue();

                System.out.println(inputText);
                System.out.println(selectedOption);
                System.out.println(selectedListItem);
            }
        });
        frame.setVisible(true);
    }
}
