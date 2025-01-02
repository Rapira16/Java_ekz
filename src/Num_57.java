interface Animal7{
    void sound();
}
class Dog7 implements Animal7{
    @Override
    public void sound(){
        System.out.println("Gav!");
    }
}

public class Num_57 {
    public static void main(String[] args){
        Animal7 dog = new Dog7();
        dog.sound();
    }
}
