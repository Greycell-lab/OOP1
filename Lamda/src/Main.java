import java.util.Scanner;

public class Main {
    static int x;
    static boolean passed;
    public static void main(String[] args) {

        Calculateable calc = Double::sum;
        System.out.println(calc.getResult(12.5, 22.5));
    }
}