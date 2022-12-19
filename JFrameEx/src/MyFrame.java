import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyFrame extends JFrame {
    static int x;
    static int y;
    ArrayList<Button> buttons = new ArrayList<>();
    MyFrame(){

        JFrame frame = new JFrame();
        for(int i=0;i<9;i++) buttons.add(new Button(String.valueOf(i)));
        for(var x : buttons) frame.add(x);

        Dimension d = new Dimension(600, 600);
        JTextField tf = new JTextField();
        JTextField tf1 = new JTextField();
        JButton bt = new JButton("Click");
        bt.setBounds(120, 10, 100, 50);
        tf.setBounds(10, 10, 100, 50);
        tf1.setBounds(230, 10, 100, 50);
        bt.addActionListener(e -> {
            try {
                x = Integer.parseInt(tf.getText());
                tf1.setText(String.valueOf(x));
            }
            catch(NumberFormatException ex){
                tf1.setText("No Valid Number!");
            }
        });
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(d);
        frame.add(tf);
        frame.add(bt);
        frame.add(tf1);
        frame.setVisible(true);
        frame.setFocusable(true);
    }
}
