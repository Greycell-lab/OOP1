public class Bicycle extends Vehicle{
    public Bicycle(String name){
        this.name = name;
    }
    @Override
    public void driveVehicle(){
        System.out.println("The Bicycle drives.");
    }
}
