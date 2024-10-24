import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    ButtonGroup group;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "";
        if (e.getSource() == birdButton) {
            message = "You selected Bird!";
        } else if (e.getSource() == catButton) {
            message = "You selected Cat!";
        } else if (e.getSource() == dogButton) {
            message = "You selected Dog!";
        } else if (e.getSource() == rabbitButton) {
            message = "You selected Rabbit!";
        } else if (e.getSource() == pigButton) {
            message = "You selected Pig!";
        }

       
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
