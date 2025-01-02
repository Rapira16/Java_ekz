class Animal3{
    public void eat(){
        System.out.println("Nyam");
    }
}
class Dog3 extends Animal3{
    public void bark(){
        System.out.println("Gav");
    }
}

public class Num_50 {
    public static void main(String[] args){
        Dog3 dog = new Dog3();
        dog.eat();
        dog.bark();
    }
}
