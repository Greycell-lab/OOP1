import java.util.ArrayList;

public class Ritter {
    private static ArrayList<Ritter> ritter = new ArrayList<>();
    private String name;
    private Pferd pferd;
    public Ritter(){
        Pferd p = new Pferd();
        p.setBesitzer(this);
        this.pferd = p;
        ritter.add(this);
        Pferd.getPferde().add(p);
    }
    public Ritter(String ritterName, String pferdName){
        this();
        this.name = ritterName;
        this.pferd.setName(pferdName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pferd getPferd() {
        return pferd;
    }

    public static ArrayList<Ritter> getRitter() {
        return ritter;
    }

    public String getName() {
        return name;
    }
}
