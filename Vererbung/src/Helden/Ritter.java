package Helden;

public class Ritter extends Held{
    private final int strength;
    public Ritter(String name, Volk volk, int strength){
        super(name, volk);
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }
}
