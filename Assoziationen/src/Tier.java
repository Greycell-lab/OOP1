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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tierart getArt() {
        return art;
    }

    public void setArt(Tierart art) {
        this.art = art;
    }
}
