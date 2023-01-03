public class Main {
    public static void main(String[] args) {
        Artikel pizza = new Artikel(1, "Pizza", 1.50, 35);
        Artikel bohnen = new Artikel(2, "Bohnen", 0.50, 25);
        Artikel bananen = new Artikel(3, "Bananen", 0.80, 30);
        Warenkorb kunde = new Warenkorb();
        do{
            kunde.showMenu();
        }while(true);

    }
}