import java.util.Scanner;

public class Main {
    static int x;
    static boolean passed;
    public static void main(String[] args) {
    PasswordGetable p  = () ->{
      do {
          try {
              System.out.println("Input Password: ");
              x = Integer.parseInt(new Scanner(System.in).nextLine());
              passed = true;
          } catch (NumberFormatException e) {
              System.out.println("Something went wrong. Try again.");
              passed = false;
          }
      }while(!passed);
    };
        p.getPassword();
    }
}