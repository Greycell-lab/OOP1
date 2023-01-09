import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porsche");
        Bicycle bicycle = new Bicycle("Bounty");
        car.driveVehicle();
        bicycle.driveVehicle();
        System.out.println(car.name + " " + bicycle.name);
    }
}