import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyFrame extends JFrame {
    static int x;
    static int y;
    static int X = 10;
    static int Y = 70;
    static int counter = 0;
    static StringBuilder num = new StringBuilder();
    static int number;
    static int sum;
    static int temp;
    String operator;
    ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<Button> operators = new ArrayList<>();
    MyFrame(){
        Dimension d = new Dimension(460, 350);
        JTextField tf = new JTextField();
        tf.setText("0");
        tf.setFont(new Font("Curier New", Font.BOLD, 25));
        tf.setEditable(false);
        tf.setHorizontalAlignment(SwingConstants.RIGHT);
        JFrame frame = new JFrame();
        for(int i=0;i<9;i++) buttons.add(new Button(String.valueOf(i+1)));
        for(var x : buttons)
        {
            x.addActionListener(e -> {
                num.append(x.getLabel());
                tf.setText(num.toString());
            });
            counter++;
            x.setBounds(X, Y, 100, 50);
            X += 110;
            if(counter == 3)
            {
                Y += 60;
                X = 10;
                counter = 0;
            }
            frame.add(x);
        }
        Button zero = new Button("0");
        zero.setBounds(120, 250, 100, 50);
        zero.addActionListener(e -> {
            num.append(zero.getLabel());
            tf.setText(num.toString());
        });
        Button negative = new Button("negative");
        Button clear = new Button("C");
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");
        Button equals = new Button("=");
        negative.setBounds(230, 250, 100, 50);
        clear.setBounds(10, 250, 100, 50);
        minus.setBounds(340, 130, 100, 50);
        multiply.setBounds(340, 190, 100, 50);
        divide.setBounds(340, 250, 100, 50);
        equals.setBounds(340, 10, 100, 50);
        equals.addActionListener(e ->{
            if(operator.equals("+")) sum = number + Integer.parseInt(num.toString());
            if(operator.equals("-")) sum = number - Integer.parseInt(num.toString());
            if(operator.equals("*")) sum = number * Integer.parseInt(num.toString());
            if(operator.equals("/")) sum = number / Integer.parseInt(num.toString());
            tf.setText(String.valueOf(sum));
            num.delete(0, num.length());
            number = sum;
        });
        plus.setBounds(340, 70, 100, 50);
        plus.addActionListener(e -> {
            operator = "+";
            number = Integer.parseInt(num.toString());
            num.delete(0, num.length());
            tf.setText("0");
        });
        minus.addActionListener(e -> {
            operator = "-";
            number = Integer.parseInt(num.toString());
            num.delete(0, num.length());
            tf.setText("0");
        });
        multiply.addActionListener(e -> {
            operator = "*";
            number = Integer.parseInt(num.toString());
            num.delete(0, num.length());
            tf.setText("0");
        });
        divide.addActionListener(e -> {
            operator = "/";
            number = Integer.parseInt(num.toString());
            num.delete(0, num.length());
            tf.setText("0");
        });
        clear.addActionListener(e -> {
            num.delete(0, num.length());
            number = 0;
            tf.setText("0");
        });
        tf.setBounds(10, 10, 320, 50);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(d);
        frame.add(tf);
        frame.add(multiply);
        frame.add(divide);
        frame.add(minus);
        frame.add(zero);
        frame.add(equals);
        frame.add(plus);
        frame.add(clear);
        frame.add(negative);
        frame.setVisible(true);
        frame.setFocusable(true);
    }
}
