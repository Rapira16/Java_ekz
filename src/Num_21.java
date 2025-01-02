sealed abstract class Vehicle permits Car2, Truck, Motorcycle{
    public abstract int getNumberOfWheels();
}

final class Car2 extends Vehicle{
    @Override
    public int getNumberOfWheels(){
        return 4;
    }
}

final class Truck extends Vehicle{
    @Override
    public int getNumberOfWheels(){
        return 6;
    }
}

final class Motorcycle extends Vehicle{
    @Override
    public int getNumberOfWheels(){
        return 2;
    }
}

public class Num_21 {
    public static void main(String[] args){
        Vehicle car = new Car2();
        Vehicle truck = new Truck();
        Vehicle motorcycle = new Motorcycle();
        System.out.println(car.getNumberOfWheels());
        System.out.println(truck.getNumberOfWheels());
        System.out.println(motorcycle.getNumberOfWheels());
    }
}
