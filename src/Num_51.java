class Sum{
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public  double add(double a, double b){
        return a + b;
    }
}

public class Num_51 {
    public static void main(String[] args){
        Sum sum = new Sum();
        System.out.println(sum.add(3,6));
        System.out.println(sum.add(1,2,3));
        System.out.println(sum.add(2.4, 3.6));
    }
}
