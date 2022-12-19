import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1983, 10, 19);
        Person a = new Person();
        Person b = new Person();
        a.setGeburtsdatum(date);
        a.setID(1);
        a.setName("Dominik");
        System.out.println("Name: " + a.getName() + "\nGeburtsdatum: " + a.getGeburtsdatum() + "\nID: "+ a.getID());
    }
}