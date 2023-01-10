package Gehalt;

import java.util.Random;

public class Mitarbeiter extends Personal {
    public Mitarbeiter() {
        super();
        this.gehalt = rnd.nextDouble(1900,2100);
        löhne += this.gehalt;
    }
}
