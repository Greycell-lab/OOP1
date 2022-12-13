import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    /**
     *
     * @param args
     * Main arguments
     */
    public static void main(String[] args) {
        //int x = getInteger();
        //System.out.println(x);

        //ElectricityCost laptop = new ElectricityCost(70, 6.5, 0.38);
        //System.out.println("Cost per year: " +laptop.costs());
    }
    /**
     *
     * @return Assigned Integer
     */
    public static int getInteger()
    {
        int x=0;
        do {
            try{
                System.out.print("Input Integer: ");
                x = Integer.parseInt(sc.nextLine());
            }
            catch(Exception e)
            {
                System.out.println("Something went wrong.");
                System.out.println(e.getMessage());
            }
        }while(x<10);
        return x;
    }
}