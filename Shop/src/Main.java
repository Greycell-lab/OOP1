public class Main {
    public static void main(String[] args) {
        Artikel pizza = new Artikel(1, "Pizza", 1.50, 35);
        Artikel bohnen = new Artikel(2, "Bohnen", 0.50, 25);
        Artikel bananen = new Artikel(3, "Bananen", 0.80, 30);
        Artikel chips = new Artikel(4, "Chips", 0.35, 75);
        Artikel shampoo = new Artikel(5, "Shampoo", 1.15, 60);
        Warenkorb warenkorb = new Warenkorb();
        do{
            warenkorb.showMenu();
        }while(true);
    }
}