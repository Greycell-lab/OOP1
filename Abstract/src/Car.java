public class Car extends Vehicle {
    public Car(String name){
        this.name = name;
    }
    @Override
    public void driveVehicle(){
        System.out.println("The Car drives.");
    }
}
