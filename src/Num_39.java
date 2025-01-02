class Driver2 {
    private String name;
    public Driver2(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Car4{
    private String model;
    private Driver2 driver;
    public Car4(String model){
        this.model = model;
    }
    public void assignDriver(Driver2 driver){
        this.driver = driver;
    }
    public void displayDriver(){
        System.out.println(model + " " + driver);
    }
}
public class Num_39 {
    public static void main(String[] args){
        Driver2 driver = new Driver2("Goida");
        Car4 car = new Car4("Lexus");
        car.assignDriver(driver);
        car.displayDriver();
    }
}
