interface CanFly{
    void fly();
}
interface CanSwim{
    void swim();
}
class Bird implements CanFly, CanSwim{
    @Override
    public void fly(){
        System.out.println("flying");
    }
    @Override
    public void swim(){
        System.out.println("swimming");
    }
}
public class Num_70 {
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}
