class Counter{
    static int count = 0;
    public Counter(){
        count++;
    }
    public static void displayCount(){
        System.out.println(count);
    }
}
public class Num_29 {
    public static void main(String[] args){
        new Counter();
        new Counter();
        Counter.displayCount();
    }
}
