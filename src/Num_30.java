class Driver{
    private String name;
    public Driver(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void drive(Car3 car){
        car.start(this);
    }
}
class Car3{
    public void start(Driver driver){
        System.out.println(driver.getName());
    }
}
public class Num_30 {
    public static void main(String[] args){
        Driver driver = new Driver("Kuplinov");
        Car3 car = new Car3();
        driver.drive(car);
    }
}
