import java.util.Scanner;

public class Operations
{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int sub(int a, int b)
    {
        return a - b;
    }
    public static int mul(int a, int b)
    {
        return a * b;
    }
    public static int div(int a, int b)
    {
        return a / b;
    }
    public static void chooseOperation(int a, int b)
    {
        Scanner sc = new Scanner(System.in);
        int choose=0;
        System.out.println("*********************");
        System.out.println("* 1: Addition       *");
        System.out.println("* 2: Substraction   *");
        System.out.println("* 3: Multiplication *");
        System.out.println("* 4: Division       *");
        System.out.println("* 5: Quit           *");
        System.out.println("*********************");
        System.out.print("Choose: ");
        choose = Integer.parseInt(sc.nextLine());
        switch(choose)
        {
            case 1: System.out.println("Sum: "+add(a, b)); break;
            case 2: System.out.println("Difference: "+sub(a, b)); break;
            case 3: System.out.println("Product: "+mul(a, b)); break;
            case 4: System.out.println("Quotient: "+div(a, b)); break;
            default: System.out.println("Wrong Input");
        }

    }
}
