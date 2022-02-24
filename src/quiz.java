import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class quiz extends JFrame  implements ActionListener {
    JButton nextButton, lifelineButton, submit;
    JLabel question, number;
    JRadioButton option1, option2, option3, option4;
    ButtonGroup options;
    public static int count = 0;
    public static int timer = 15;
    public static int answers_given = 0;
    public static int score = 0;
    String q[][] = new String[10][5];
    String answers[][] = new String[10][1];
    String ca[][] = new String[10][2];

    String username;
    quiz(String username) {
        this.username = username;
        setBounds(200, 100, 900, 450);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/quiz/icons/quiz.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,225 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, -25, 900, 225);
        add(l1);

        number = new JLabel("");
        number.setFont(new Font("Tahoma", Font.PLAIN, 15));
        number.setBounds(30, 200, 30, 40);
        add(number);

        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 15));
        question.setBounds(50, 200, 800, 40);
        add(question);

        option1 = new JRadioButton("");
        option1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        option1.setBounds(50, 230, 400, 30);
        option1.setBackground(Color.LIGHT_GRAY);
        add(option1);

        option2 = new JRadioButton("");
        option2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        option2.setBounds(50, 260, 400, 30);
        option2.setBackground(Color.LIGHT_GRAY);
        add(option2);

        option3 = new JRadioButton("");
        option3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        option3.setBounds(50, 290, 400, 30);
        option3.setBackground(Color.LIGHT_GRAY);
        add(option3);

        option4 = new JRadioButton("");
        option4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        option4.setBounds(50, 320, 400, 30);
        option4.setBackground(Color.LIGHT_GRAY);
        add(option4);

        options = new ButtonGroup();
        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);

        q[0][0] = "Which of the following option leads to the portability and security of Java? ?";
        q[0][1] = "Bytecode is executed by JVM";
        q[0][2] = "The applet makes the Java code secure and portable";
        q[0][3] = "Use of exception handling";
        q[0][4] = "Dynamic binding between objects";

        q[1][0] = "Which of the following is not a Java features?";
        q[1][1] = "Dynamic";
        q[1][2] = "Architecture Neutral";
        q[1][3] = "Use of pointers";
        q[1][4] = "Object-oriented";

        q[2][0] = "_____ is used to find and fix bugs in the Java programs.";
        q[2][1] = "JVM";
        q[2][2] = "JRE";
        q[2][3] = "JDK";
        q[2][4] = "JDB";

        q[3][0] = "What is the return type of the hashCode() method in the Object class?";
        q[3][1] = "Object";
        q[3][2] = "Int";
        q[3][3] = "Long";
        q[3][4] = "Void";

        q[4][0] = "What does the expression float a = 35 / 0 return?";
        q[4][1] = "Zero";
        q[4][2] = "Not a number";
        q[4][3] = "Infinity";
        q[4][4] = "Run time exception";

        q[5][0] = "What is used to generate API documentation in HTML format from doc comments in source code?";
        q[5][1] = "javap tool";
        q[5][2] = "javaw command";
        q[5][3] = "Javadoc tool";
        q[5][4] = "javah command";

        q[6][0] = "Which of the following creates a List of 3 visible items and multiple selections abled?";
        q[6][1] = "new List(false, 3)";
        q[6][2] = "new List(3, true)";
        q[6][3] = "new List(true, 3)";
        q[6][4] = "new List(3, false)";

        q[7][0] = "Which of Class.class method is used to determine the name of a class represented as a string?";
        q[7][1] = "getClass()";
        q[7][2] = "intern()";
        q[7][3] = "getName()";
        q[7][4] = "toString()";

        q[8][0] = "Which of the following is true about the anonymous inner class?";
        q[8][1] = "It has only methods";
        q[8][2] = "Objects can't be created";
        q[8][3] = "It has a fixed class name";
        q[8][4] = "It has no class name";

        q[9][0] = "Which package contains the Random class?";
        q[9][1] = "java.util package";
        q[9][2] = "java.lang package";
        q[9][3] = "java.awt package";
        q[9][4] = "java.io package";

        ca[0][1] = "Bytecode is executed by JVM";
        ca[1][1] = "Use of pointers";
        ca[2][1] = "JDB";
        ca[3][1] = "Int";
        ca[4][1] = "Infinity";
        ca[5][1] = "Javadoc tool";
        ca[6][1] = "new List(3, true)";
        ca[7][1] = "getClass()";
        ca[8][1] = "It has no class name";
        ca[9][1] = "java.util package";


        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        nextButton.setBounds(760, 260, 80, 20);
        nextButton.setBackground(new Color(30, 144, 254));
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        add(nextButton);

        lifelineButton = new JButton("50-50");
        lifelineButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lifelineButton.setBounds(760, 300, 80, 20);
        lifelineButton.setBackground(new Color(30, 144, 254));
        lifelineButton.setForeground(Color.WHITE);
        lifelineButton.addActionListener(this);
        add(lifelineButton);

        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 14));
        submit.setBounds(760, 340, 80, 20);
        submit.setBackground(new Color(30, 144, 254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        setVisible(true);
        start(0);
    }

    public void start(int count) {
        number.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);

        option1.setLabel(q[count][1]);
        option1.setActionCommand(q[count][1]);
        option2.setLabel(q[count][2]);
        option2.setActionCommand(q[count][2]);
        option3.setLabel(q[count][3]);
        option3.setActionCommand(q[count][3]);
        option4.setLabel(q[count][4]);
        option4.setActionCommand(q[count][4]);

        options.clearSelection();


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == nextButton) {
            repaint();
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);

            answers_given = 1;
            if(options.getSelection()== null){
                answers[count][0]="";

            }else{
                answers[count][0] = options.getSelection().getActionCommand();
            }
            if (count == 8){
                nextButton.setEnabled(false);
                submit.setEnabled(true);
            }
            count ++;
            start(count);
        } else if (ae.getSource() == submit) {
            answers_given = 1;
            if(options.getSelection()== null){
                answers[count][0]="";

            }else{
                answers[count][0] = options.getSelection().getActionCommand();
            }

            for (int i = 0 ; i< answers.length ;i++){
                if (answers[i][0].equals(ca[i][1])){
                    score +=10;
                }else{
                    score += 0;
                }

            }
            this.setVisible(false);
            new score(username,score).setVisible(true);

        } else if (ae.getSource() == lifelineButton) {
            if(count == 1 || count == 3 || count == 6 || count == 8 || count == 9) {
                option3.setEnabled(false);
                option4.setEnabled(false);
            }else {
                option1.setEnabled(false);
                option2.setEnabled(false);
            }
            lifelineButton.setEnabled(false);

        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        String time = "Time Left : " + timer + " Sec";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.PLAIN, 12));

        if (timer > 0) {
            g.drawString(time, 760, 250);
        } else {
            g.drawString("Times up", 760, 250);
        }
        timer--;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
            if (answers_given == 1){
                answers_given = 0;
                timer = 15;
            }else if (timer < 0){
                timer = 15;
                option1.setEnabled(true);
                option2.setEnabled(true);
                option3.setEnabled(true);
                option4.setEnabled(true);


                if(count == 8){
                    nextButton.setEnabled(false);
                    submit.setEnabled(true);
                }
                if (count == 9){
                    if(options.getSelection()== null){
                        answers[count][0]="";

                    }else{
                        answers[count][0] = options.getSelection().getActionCommand();
                    }

                    for (int i = 0 ; i< answers.length ;i++){
                        if (answers[i][0].equals(ca[i][1])){
                            score +=10;
                        }else{
                            score += 0;
                        }

                    }
                    this.setVisible(false);
                    new score(username,score).setVisible(true);

                }else{
                    if(options.getSelection()== null){
                        answers[count][0]="";

                    }else{
                        answers[count][0] = options.getSelection().getActionCommand();
                    }
                    count ++;
                    start(count);
                }
            }

    }

        public static void main (String[]args){
            new quiz("").setVisible(true);

        }
    }