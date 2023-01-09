import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gruppe dungeon = new Gruppe();
        Gruppe raid = new Gruppe();
        dungeon.addAbenteurer("Dominus");
        dungeon.addAbenteurer("Lanzelot");
        raid.addAbenteurer("Pfirsich");
        raid.addAbenteurer("Apfelmus");
        for(var x : dungeon.getAbenteurerInDerGruppe()) System.out.println(x);
        for(var x : raid.getAbenteurerInDerGruppe()){        }

        /*new Kuchen(new ArrayList<>());
        new Kuchen(new ArrayList<>(Arrays.asList(2, 5, 6)));
        new Kuchen(new ArrayList<>(Arrays.asList(4, 5, 3, 2)));
        new Kuchen(new ArrayList<>(Arrays.asList(5, 2, 3, 6, 3)));
        Kuchen.zeigeAlleKuchen();*/
    }
}