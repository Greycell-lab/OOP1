package Helden;

import java.util.ArrayList;

public class Held {
    public static ArrayList<Held> heldListe = new ArrayList<>();
    private String name;
    private Volk volk;
    public Held(String name, Volk volk){
        this.name = name;
        this.volk = volk;
        heldListe.add(this);
    }
    public String getName(){
        return name;
    }
    public Volk getVolk(){
        return volk;
    }
}
