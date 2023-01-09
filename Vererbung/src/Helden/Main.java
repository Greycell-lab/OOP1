package Helden;

public class Main {
    public static void main(String[] args) {
        new Ritter("Lanzelot", Volk.ELF, 255);
        new Magier("Magus", Volk.ZWERG, 255);
        for(var x : Held.heldListe){
            if(x instanceof Ritter r) System.out.println("Name: " + x.getName() + "\nVolk: " + x.getVolk() + "\nStrength: " + r.getStrength());
            else if(x instanceof Magier m) System.out.println("Name: " + x.getName() + "\nVolk: " + x.getVolk() + "\nWillpower: " + m.getWillpower());
        }
    }
}
