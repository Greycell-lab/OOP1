import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator<Double> x = new Calculator<>();
        Calculator<Integer> y = new Calculator<>();
        x.setNumber1(2.5);
        x.setNumber2(1.5);
        y.setNumber1(15);
        y.setNumber2(25);
        System.out.println(x.number1+x.number2);
        System.out.println(y.number1+y.number2);
        };
}