import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageButton extends JFrame {
    JFrame jFrame;
    ImageButton(){
        JButton jButton = new JButton(new ImageIcon(getClass().getResource("img/joystick.png")));
        jButton.setBounds(425, 335, 50, 50);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });

        setSize(900, 700);
        add(jButton);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ImageButton();
    }
}
