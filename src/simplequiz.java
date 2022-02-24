import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simplequiz extends JFrame  implements ActionListener {
    JButton b1,b2;
    JTextField t1;
    simplequiz(){
        setBounds(200,100,900,450);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/quiz/icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0, 450,450);
        add(l1);

        JLabel l2 = new JLabel("Simple Quiz");
        l2.setFont(new Font("Viner Hand ITC" , Font.BOLD, 26));
        l2.setBounds(580,50, 400,50);
        l2.setForeground(new Color(30,144,254));
        add(l2);

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti" , Font.BOLD, 16));
        l3.setBounds(600,150, 300,40);
        l3.setForeground (new Color(120));
        add(l3);

        JLabel l4 = new JLabel("made by Dibyajyoti Das");
        l4.setFont(new Font("Tahoma" , Font.PLAIN ,10));
        l4.setBounds(750,370,120,30);
        l4.setForeground(Color.BLACK);
        add(l4);

        t1 = new JTextField();
        t1.setBounds(560,180,200,25);
        t1.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(t1);

        b1 = new JButton("Rules");
        b1.setBounds(560,250,85,20);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Exit");
        b2.setBounds(680,250,85,20);
        b2.setBackground(new Color(30,144,254));
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        add(b2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1) {
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);


        }else{
            System.exit(0);
        }

    }

    public static void main(String[] args) {

        new simplequiz();
    }
}
