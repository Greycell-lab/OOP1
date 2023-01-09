package Robot;

public class Main {
    public static void main(String[] args) {
        Terminator te = new Terminator();
        te.name = "T3000";
        te.targetName = "Ann";
        te.isHostile = false;
        Transformer tr = new Transformer();
        tr.name = "Bumblebee";
        tr.faction = "Autobot";
        tr.isHostile = false;
        Android a = new Android();
        a.name = "T100";
        a.isHuman = false;
        a.isHostile = true;
        for(var x : Robot.robots){
            if(x.getClass() == Transformer.class) System.out.println("Name: " + x.name + "\nFaction: " + ((Transformer) x).faction + "\nHostile: " + x.isHostile);
            else if(x.getClass() == Terminator.class) System.out.println("Name: " + x.name + "\nTarget Name: " + ((Terminator) x).targetName + "\nHostile: " + x.isHostile);
            else if(x.getClass() == Android.class) System.out.println("Name: " + x.name + "\nHuman: " + ((Android) x).isHuman + "\nHostile: " + x.isHostile);
            System.out.println();
        }

    }
}
