class Animal5{
    public void sound(){
        System.out.println("ouch");
    }
}
class Dog5 extends Animal5{
    @Override
    public void sound(){
        super.sound();
        System.out.println("Gavkaet");
    }
}
public class Num_53 {
    public static void main(String[] args){
        Dog5 dog = new Dog5();
        dog.sound();
    }
}
