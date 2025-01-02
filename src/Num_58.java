interface Animal58{
    void sound();
    default void info(){
        System.out.println("Animal");
    }
}
class Dog58 implements Animal58{
    @Override
    public void sound(){
        System.out.println("Gav!");
    }
}

public class Num_58 {
    public static void main(String[] args){
        Animal58 dog = new Dog58();
        dog.sound();
        dog.info();
    }
}
