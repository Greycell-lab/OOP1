public class Main {
    public static void main(String[] args) {
        String name = "Ich";
        int a = 1;
        MyInterface myInterface;
        if(a == 1) {
            myInterface = (x, y) -> {
                System.out.println("Hello World");
                System.out.println("I am the best");
                System.out.println("Hey " + x + " You are " + y);
            };
        }
        else{
            myInterface = (x, y) -> {
                System.out.println("Hello World");
                System.out.println("I am the best");
                System.out.println("Hey " + x + " You are " + y);
            };
        }
        myInterface.showInfo(name, 39);
    }
}