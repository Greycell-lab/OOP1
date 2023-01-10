package Gehalt;

public class Vorgesetzter extends Personal{
    public Vorgesetzter(){
        super();
        this.gehalt = rnd.nextDouble(3700, 4300) + rnd.nextDouble(450, 550);
        löhne += this.gehalt;
    }
}
