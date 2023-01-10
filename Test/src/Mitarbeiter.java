import java.util.ArrayList;

public class Mitarbeiter {
    public static ArrayList<Mitarbeiter> liste = new ArrayList<>();
    private String name;
    public Mitarbeiter(String name){
        this.name = name;
        liste.add(this);
    }
    public String getName() {
        return name;
    }
}
