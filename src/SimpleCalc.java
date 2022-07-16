import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc extends JFrame {
    JFrame jFrame;
    SimpleCalc(){
        setSize(500, 500);
        setTitle("Simple Calculator");

        JLabel jLabel1 = new JLabel("Number 1");
        jLabel1.setBounds(50, 100, 100,30);
        JLabel jLabel2 = new JLabel("Number 2");
        jLabel2.setBounds(50, 160, 100,30);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(160, 100, 200,30);
        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(160, 160, 200,30);

        JButton jButton1 = new JButton("+");
        jButton1.setBounds(50, 220,50, 30);
        JButton jButton2 = new JButton("-");
        jButton2.setBounds(110, 220,50, 30);
        JButton jButton3 = new JButton("/");
        jButton3.setBounds(170, 220,50, 30);
        JButton jButton4 = new JButton("*");
        jButton4.setBounds(230, 220,50, 30);

        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);

        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
        add(jLabel1);
        add(jLabel2);
        add(jTextField1);
        add(jTextField2);
        setLayout(null);
        setVisible(true);
    }
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = new jTex
        }
    };
    public static void main(String[] args) {
        new SimpleCalc();
    }
}
