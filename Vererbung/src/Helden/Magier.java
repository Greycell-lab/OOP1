package Helden;
public class Magier extends Held{
    private final int willpower;
    public Magier(String name, Volk volk, int willpower){
        super(name, volk);
        this.willpower = willpower;
    }
    public int getWillpower() {
        return willpower;
    }
}
