abstract class Animal67{
    abstract void sound();
    void eat(){
        System.out.println("Eats food");
    }
}
class Dog67 extends Animal67{
    @Override
    void sound(){
        System.out.println("Gav!");
    }
}
public class Num_67 {
    public static void main(String[] args){
        Animal67 dog = new Dog67();
        dog.sound();
        dog.eat();
    }
}
