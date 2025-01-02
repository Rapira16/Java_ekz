abstract class Animal2{
    abstract void makeSound();
    public void eat(){
        System.out.println("UKUSNO");
    }
}
class Dog2 extends Animal2{
    @Override
    void makeSound(){
        System.out.println("Gav!");
    }
}

class Cat extends Animal2{
    @Override
    void makeSound(){
        System.out.println("Meow!");
    }
}

public class Num_37 {
    public static void main(String[] args){
        Animal2 dog = new Dog2();
        Animal2 cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
