import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        if(!takeiniput())takeiniput();
    }
    public static void draw(int x, int y)
    {
        for(int i=0;i<y;i++)
        {
            for (int j=0;j<x;j++)
            {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static boolean takeiniput()
    {
        try
        {
            System.out.print("Input X: ");
            int x = Integer.parseInt(sc.nextLine());
            System.out.print("Input Y: ");
            int y = Integer.parseInt(sc.nextLine());
            draw(x, y);
        }
        catch(Exception e)
        {
            System.out.println("Da ist wohl etwas schief gelaufen.");
            System.out.println("Error: " + e.toString());
            return false;
        }
        return true;
    }
}