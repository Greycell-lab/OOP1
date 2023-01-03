public class Main {
    public static void main(String[] args) {
        Artikel pizza = new Artikel(1, "Pizza", 1.50, 35);
        Artikel bohnen = new Artikel(2, "Bohnen", 0.50, 25);
        Artikel bananen = new Artikel(1, "Bananen", 0.80, 30);
        Warenkorb kunde = new Warenkorb();
        kunde.inDenWarenkorb(pizza, 1);
        kunde.inDenWarenkorb(bohnen, 1);
        kunde.inDenWarenkorb(bananen, 1);
        System.out.println(String.format("%.2f", kunde.getSumme()));
        kunde.getWarenkorb().replace(pizza, 4);
        System.out.println(String.format("%.2f", kunde.getSumme()));
    }
}