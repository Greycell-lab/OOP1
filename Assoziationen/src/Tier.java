import java.util.ArrayList;

public class Tier {
    public static ArrayList<Tier> tierList = new ArrayList<>();
    private int id;
    private String name;
    private Tierart art;
    public Tier(int id, String name, Tierart art){
        this.id = id;
        this.name = name;
        this.art = art;
        tierList.add(this);
    }
    public String getName() {
        return name;
    }
    public Tierart getArt() {
        return art;
    }
}
