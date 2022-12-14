import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine melitta = new CoffeeMachine("Melitta");
        boolean on;
        do{
            on = melitta.printContent();
        }while(on);
    }

}