public class Roboter
{
    public int batterieLaufzeit;
    public String aufgabe;
    public Roboter(int batterie, String aufgabe)
    {
        this.batterieLaufzeit = batterie;
        this.aufgabe = aufgabe;
    }
    public boolean istBatterieLaufzeitNiedrig()
    {
        return batterieLaufzeit<2;
    }
    public void fuehreAufgabeAus()
    {
        if(istBatterieLaufzeitNiedrig()) System.out.println("Muss aufgeladen werden");
        else System.out.println(aufgabe);
        batterieLaufzeit--;
    }
}

