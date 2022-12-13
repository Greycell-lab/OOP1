import java.util.Scanner;

public class CoffeeMachine {
    static Scanner sc = new Scanner(System.in);
    String name;
    final double maxWater = 2.5;
    final double maxBeans = 2.5;
    double water = 0;
    double beans = 0;
    int coinInput = 0;
    public CoffeeMachine(String name)
    {
        this.name = name;
    }
    public void fillWater(double water)
    {
        if(this.water+water<=maxWater)
        {
            this.water = water;
            System.out.println(water + " filled into Machine");
        }
        else System.out.println("That is too much Water");
    }


    public void fillBeans()
    {

        if((this.beans+Double.parseDouble(sc.nextLine()))<=maxBeans)
        {
            this.beans+=Double.parseDouble(sc.nextLine());
            System.out.println(beans + " filled into Machine");
        }
        else System.out.println("That are too much Beans");
    }

    public void fillMachine(double water, double beans)
    {
        fillWater(water);
        fillBeans();
    }
    public boolean printContent()
    {
        int choose;
        System.out.println();
        System.out.println(this.name + " Coffee Machine");
        System.out.println();
        System.out.println("Water: " + this.water);
        System.out.println("Beans: " + this.beans);
        System.out.println("Inserted Coins: " + this.coinInput);
        System.out.println("1: Insert Coin");
        System.out.println("2: Fill Water");
        System.out.println("3: Fill Beans");
        System.out.println("4: Shutdown the Coffee Machine");
        System.out.print("Choose: ");
        if((choose = getInput())!=-1)
        {
            if(choose==1) coinInput++;
            if(choose==2) fillWater(0.5);
            if(choose==3) fillBeans();
            if(choose==4) {
                System.out.println("Shutting down...");
                return false;
            }

        }
        return true;
    }
    public void startMachine()
    {

    }
    public int getInput()
    {
        int input;
        do {
            try {
                input = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Wrong Input.");
                return -1;
            }
        }while(input <0 || input > 4);
        return input;
    }

}
