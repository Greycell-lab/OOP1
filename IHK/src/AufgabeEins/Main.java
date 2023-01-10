package AufgabeEins;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Raum.fillArray();
        Raum.getBelegung(Raum.getArray());
        for(var x : Raum.getArray()) System.out.println(x.getBelegung());

    }
}
