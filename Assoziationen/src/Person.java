import java.util.ArrayList;

public class Person {
    private final int id;
    private String nachname;
    static final ArrayList<Person> list = new ArrayList<>();
    public Person(int id, String nachname){
        this.id = id;
        this.nachname = nachname;
        list.add(this);
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getId() {
        return id;
    }
}
