import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(200,100,900,450);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        JLabel l1 = new JLabel("Welcome " + username + " to Simple Quiz...");
        l1.setFont(new Font("Viner Hand ITC" , Font.BOLD, 36));
        l1.setBounds(150,10, 850,50);
        l1.setForeground(new Color(30,144,254));
        add(l1);

        JLabel l2 = new JLabel("Rules...");
        l2.setFont(new Font("Mongolian Baiti" , Font.BOLD, 30));
        l2.setBounds(30,40, 150,50);
        l2.setForeground(Color.RED);
        add(l2);

        JLabel l3 = new JLabel("");
        l3.setFont(new Font("Tahoma" , Font.PLAIN ,14));
        l3.setBounds(40,80,860,320);
        l3.setForeground(Color.BLACK);
        l3.setText(
                "<html>"+
                     "1. There are 10 Mcq type questions in this set." + "<br><br>" +
                     "2. Every question has 4 possible options." + "<br><br>" +
                     "3. Each question carries 10 mark for every correct answer and 0 for wrong answer." + "<br><br>" +
                     "4. Questions are related to java language." + "<br><br>" +
                     "5. You will get 15 seconds to attend every question." + "<br><br>" +
                     "6. You will automatically redirected to next question after the time is over." + "<br><br>" +
                     "7. Next : to jump to next question" + "<br><br>" +
                      "50-50 : to eliminate 2 wrong options (valid only once)" + "<br><br>" +
                      "Submit : to submit your answers (unlocks after attending 10 questions)" + "<br><br>" +
                "<html>"
        );
        add(l3);


        b1 = new JButton("Back");
        b1.setBounds(600, 350,70,30);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(700, 350,70,30);
        b2.setBackground(new Color(30,144,254));
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        add(b2);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new simplequiz().setVisible(true);
        }else if (ae.getSource() == b2) {
            this.setVisible(false);
            new quiz(username).setVisible(true);

        }
    }

    public static void main(String[] args) {
        new Rules("");
    }
}
