import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    inputTryCatch();
    }
    public static void inputTryCatch()
    {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Integer Input: ");
            int x = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}