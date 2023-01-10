public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            new Mitarbeiter("Mitarbeiter");
            new Vorgesetzter("Vorgesetzter");
            new Vorstandsvorsitzender("Vorstandsvorsitzender");
        }
        for(var x : Mitarbeiter.liste) {
            //if(!(x instanceof Vorgesetzter)) System.out.println(x.getName());
            //if(!(x instanceof  Vorstandsvorsitzender) && x instanceof Vorgesetzter) System.out.println(x.getName());
            if(x instanceof Vorstandsvorsitzender) System.out.println(x.getName());
        }
    }
}