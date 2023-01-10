package Gehalt;

public class Vorstandsvorsitzender extends Personal {
    public Vorstandsvorsitzender(){
        super();
        this.gehalt = rnd.nextDouble(7500, 8500) + rnd.nextDouble(2500, 3100);
        this.gehalt += this.gehalt / 100 * rnd.nextDouble(5, 15);
        löhne += this.gehalt;
    }
}
