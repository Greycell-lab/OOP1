public class Main {
    public static void main(String[] args) {
        Artikel.fillArtikelList();
        Warenkorb warenkorb = new Warenkorb();
        while(true) warenkorb.showMenu();
    }
}