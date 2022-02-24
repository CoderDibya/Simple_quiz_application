import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class score extends JFrame implements ActionListener {
    JButton b1;
    score(String username , int score){
        setBounds(200, 100, 900, 450);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/quiz/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(450,425 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, -20, 450, 450);
        add(l1);

        JLabel l2 = new JLabel("Thank you " + username + " for playing Simplequiz...");
        l2.setBounds(460,60,500,50);
        l2.setFont(new Font("Viner Hand ITC" , Font.BOLD, 17));
        l2.setForeground(Color.BLUE);
        add(l2);

        JLabel l3 = new JLabel("Your Score Is : " + score);
        l3.setBounds(520,150,500,50);
        l3.setFont(new Font("Jokerman" , Font.BOLD, 20));
        l3.setForeground(new Color(199,21,133));
        add(l3);

        b1 = new JButton("PLAY AGAIN");
        b1.setBounds(560,300,150,20);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

    }
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new simplequiz().setVisible(true);

    }

    public static void main(String[] args) {
        new score("",0).setVisible(true);
    }
}
