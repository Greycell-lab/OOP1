import java.util.ArrayList;

public class Fach {
    private final int id;
    private final String bezeichnung;
    private static ArrayList<Fach> fachList = new ArrayList<>();
    private ArrayList<Klausur> list = new ArrayList<Klausur>();
    public Fach(int id, String bezeichnung){
        this.id = id;
        this.bezeichnung = bezeichnung;
        fachList.add(this);
    }

    public void getList() {
        System.out.println("ID\tNote");
        for(var x : list) System.out.println(x.getId() + ":\t" + x.getNote());
    }

    public void setList(Klausur k) {
        this.list.add(k);
    }

    public int getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public static void printFachList() {
        for(var x : fachList) System.out.println(x.id + ": " + x.getBezeichnung());
    }
    public static ArrayList<Fach> getFachList(){
        return fachList;
    }
}
