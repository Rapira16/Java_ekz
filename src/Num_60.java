interface Animal60{
    void sound();
    default void info(){
        System.out.println("Animal");
    }
    static void description(){
        System.out.println("Living");
    }
}
class Dog60 implements Animal60{
    @Override
    public void sound(){
        System.out.println("Gav!");
    }
}
public class Num_60 {
    public static void main(String[] args){
        Animal60 dog = new Dog60();
        dog.sound();
        dog.info();
        Animal60.description();
    }
}
