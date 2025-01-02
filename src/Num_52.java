class Animal4{
    public void eat(){
        System.out.println("Nyam");
    }
}
class Dog4 extends Animal4{
    public void bark(){
        System.out.println("Gav");
    }
}

public class Num_52 {
    public static void main(String[] args){
        Dog4 dog = new Dog4();
        dog.eat();
        dog.bark();
    }
}
