class Car{
    String color;
    String model;
    int year;
    Car(String color, String model, int year){
        this.color = color;
        this.model = model;
        this.year = year;
    }

    void displayInfo(){
        System.out.println(model);
        System.out.println(color);
        System.out.println(year);
    }
}

public class Num_19 {
    public static void main(String[] args){
        Car car1 = new Car("Red", "BMW", 2020);
        Car car2 = new Car("Black", "Toyota", 2006);
        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
    }
}