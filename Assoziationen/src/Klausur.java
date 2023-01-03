import java.util.ArrayList;

public class Klausur {
    private final int id;
    private int note;
    private final Fach fach;
    static final ArrayList<Klausur> list = new ArrayList<>();
    public Klausur(int id, int note, Fach f){
        this.id = id;
        this.note = note;
        this.fach = f;
        list.add(this);
        this.fach.setList(this);
    }

    public Fach getFach() {
        return fach;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getId() {
        return id;
    }
    public static void printKlausur(){
        System.out.println("ID");
        for(var x : list) System.out.println(x.getId());
    }
}
