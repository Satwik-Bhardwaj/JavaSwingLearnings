import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    static int i;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(900, 700);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel label = new JLabel("", SwingConstants.CENTER);
        label.setBounds(350, 305, 200, 30);

        JButton button = new JButton("Click Me");
        button.setBounds(400, 335, 100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello World!!");
                i++;
                System.out.println("Button clicked " + i + " times.");
            }
        });
        frame.add(button);
        frame.add(label);
    }
}
