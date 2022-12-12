public class CoffeeMachine {
    String name;
    final double maxWater = 2.5;
    final double maxBeans = 2.5;
    double water = 0;
    double beans = 0;
    double coinInput = 0;
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
    public void fillBeans(double beans)
    {
        if(this.beans+beans<=maxBeans)
        {
            this.beans = beans;
            System.out.println(beans + " filled into Machine");
        }
        else System.out.println("That are too much Beans");
    }
    public void fillMachine(double water, double beans)
    {
        fillWater(water);
        fillBeans(beans);
    }
    public void printContent()
    {
        System.out.println();
        System.out.println(this.name + " Coffee Machine");
        System.out.println();
        System.out.println("Water: " + this.water);
        System.out.println("Beans: " + this.beans);
        System.out.println("Inserted Coins: " + this.coinInput);
    }
    public void startMachine()
    {

    }

}
