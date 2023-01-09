import java.util.ArrayList;

public class Pferd {
    private static ArrayList<Pferd> pferde = new ArrayList<>();
    private String name;
    private Ritter besitzer;
    public String getName() {
        return name;
    }

    public Ritter getBesitzer() {
        return besitzer;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBesitzer(Ritter besitzer) {
        this.besitzer = besitzer;
    }
    public static ArrayList<Pferd> getPferde() {
        return pferde;
    }
}
