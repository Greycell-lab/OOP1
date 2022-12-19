import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Person {
    static List<Person> personen = new ArrayList<>();
    private int ID;
    private String name;
    LocalDate geburtsdatum;
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public LocalDate getGeburtsdatum(){
        return geburtsdatum;
    }
    public void setGeburtsdatum(LocalDate geburtsdatum){
        this.geburtsdatum = geburtsdatum;
    }
}
