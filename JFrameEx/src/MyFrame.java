import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame extends JFrame implements ActionListener {
    static int X = 10;
    static int Y = 70;
    static int counter = 0;
    static StringBuilder num = new StringBuilder();
    static int number;
    static int sum;
    static int number2;
    String operator = "";
    ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<Button> operators = new ArrayList<>();
    JTextField tf = new JTextField();
    MyFrame(){
        Dimension d = new Dimension(460, 350);
        tf.setText("0");
        tf.setFont(new Font("Curier New", Font.BOLD, 25));
        tf.setEditable(false);
        tf.setHorizontalAlignment(SwingConstants.RIGHT);
        JFrame frame = new JFrame();
        for(int i=0;i<9;i++) buttons.add(new Button(String.valueOf(i+1)));
        for(var x : buttons)
        {
            x.addActionListener(this);
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
        zero.addActionListener(this);
        buttons.add(zero);
        operators.add(new Button("+"));
        operators.add(new Button("-"));
        operators.add(new Button("*"));
        operators.add(new Button("/"));
        X = 340;
        Y = 70;
        for(var x : operators){
            x.addActionListener(this);
            x.setBounds(X, Y, 100, 50);
            Y += 60;
            frame.add(x);
        }
        Button equals = new Button("=");
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
        /*plus.addActionListener(e -> {
            if(!operator.equals("")) {
                System.out.println(num.toString());
                number2 = Integer.parseInt(num.toString());
                number += number2;
                num.delete(0, num.length());
                number2 = 0;
                System.out.println(number);
                tf.setText("0");
            }
            else {
                number = Integer.parseInt(num.toString());
                num.delete(0, num.length());
                tf.setText("0");
            }
            operator = "+";
        });
        minus.addActionListener(e -> {
            if(!operator.equals("")) {
                System.out.println(num.toString());
                number2 = Integer.parseInt(num.toString());
                number -= number2;
                num.delete(0, num.length());
                number2 = 0;
                System.out.println(number);
                tf.setText("0");
            }
            else {
                number = Integer.parseInt(num.toString());
                num.delete(0, num.length());
                tf.setText("0");
            }
            operator = "-";
        });
        multiply.addActionListener(e -> {
            if(!operator.equals("")) {
                System.out.println(num.toString());
                number2 = Integer.parseInt(num.toString());
                number *= number2;
                num.delete(0, num.length());
                number2 = 0;
                System.out.println(number);
                tf.setText("0");
            }
            else {
                number = Integer.parseInt(num.toString());
                num.delete(0, num.length());
                tf.setText("0");
            }
            operator = "*";
        });
        divide.addActionListener(e -> {
            if(!operator.equals("")) {
                System.out.println(num.toString());
                number2 = Integer.parseInt(num.toString());
                number /= number2;
                num.delete(0, num.length());
                number2 = 0;
                System.out.println(number);
                tf.setText("0");
            }
            else {
                number = Integer.parseInt(num.toString());
                num.delete(0, num.length());
                tf.setText("0");
            }
            operator = "/";
        });*/
        tf.setBounds(10, 10, 320, 50);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(d);
        frame.add(tf);
        frame.add(zero);
        frame.add(equals);
        frame.setVisible(true);
        frame.setFocusable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttons.get(0)){
            num.append("1");
            tf.setText(num.toString());
        }
        if(e.getSource() == buttons.get(1)){
            num.append("2");
            tf.setText(num.toString());
        }
        if(e.getSource() == buttons.get(2)){
            num.append("3");
            tf.setText(num.toString());
        }
        if(e.getSource() == buttons.get(3)){
            num.append("4");
            tf.setText(num.toString());
        }
        if(e.getSource() == buttons.get(4)){
            num.append("5");
            tf.setText(num.toString());
        }
        if(e.getSource() == buttons.get(5)){
            num.append("6");
            tf.setText(num.toString());
        }
        if(e.getSource() == buttons.get(6)){
            num.append("7");
            tf.setText(num.toString());
        }
        if(e.getSource() == buttons.get(7)){
            num.append("8");
            tf.setText(num.toString());
        }
        if(e.getSource() == buttons.get(8)){
            num.append("9");
            tf.setText(num.toString());
        }
        if(e.getSource() == buttons.get(9)){
            num.append("0");
            tf.setText(num.toString());
        }
        if(e.getSource() == operators.get(0)){
            if(operator.equals("")) {
                number = Integer.parseInt(num.toString());
                num.delete(0, num.length());
                tf.setText("0");
            }
            else{
                number2 = Integer.parseInt(num.toString());
                number += number2;
                number2 = 0;
                num.delete(0, num.length());
                tf.setText("0");
            }
        }

    }
}
