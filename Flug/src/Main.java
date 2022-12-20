import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Flug.fluege.add(new Flug("101", LocalDateTime.of(2019, 6, 12, 12, 0, 0), LocalDateTime.of(2019, 6, 12, 18, 20, 0), 1500, 12));
        Flug.fluege.add(new Flug("102", LocalDateTime.of(2019, 6, 12, 18, 0, 0), LocalDateTime.of(2019, 6, 13, 0, 0, 0), 1450, 14));
        Flug.fluege.add(new Flug("111", LocalDateTime.of(2019, 6, 12, 22, 0, 0), LocalDateTime.of(2019, 6, 13, 4, 0, 0), 1600, 18));
        Flug.fluege.add(new Flug("141", LocalDateTime.of(2019, 6, 13, 8, 0, 0), LocalDateTime.of(2019, 6, 13, 14, 0, 0), 1700, 5));
        Flug.fluege.add(new Flug("251", LocalDateTime.of(2019, 6, 13, 12, 0, 0), LocalDateTime.of(2019, 6, 13, 18, 0, 0), 1000, 34));
        Flug.fluege.add(new Flug("607", LocalDateTime.of(2019, 6, 13, 18, 0, 0), LocalDateTime.of(2019, 6, 14, 0, 0, 0), 1100, 15));
        Flug.fluege.add(new Flug("638", LocalDateTime.of(2019, 6, 14, 8, 0, 0), LocalDateTime.of(2019, 6, 14, 14, 0, 0), 1650, 7));
        Flug.fluege.add(new Flug("703", LocalDateTime.of(2019, 6, 14, 12, 0, 0), LocalDateTime.of(2019, 6, 14, 18, 0, 0), 1450, 10));
        Flug.fluege.add(new Flug("784", LocalDateTime.of(2019, 6, 14, 18, 0, 0), LocalDateTime.of(2019, 6, 15, 0, 0, 0), 1800, 2));
        Flug.fluege.add(new Flug("788", LocalDateTime.of(2019, 6, 14, 22, 0, 0), LocalDateTime.of(2019, 6, 15, 4, 0, 0), 1200, 38));
        Flug.sucheFlug(LocalDateTime.of(2019,6,12,12,0, 0), 5);
        Flug.sucheFlug(LocalDateTime.of(2019,6,12,18,0, 0), 5);
        Flug.ausgabeFlug();
    }
}