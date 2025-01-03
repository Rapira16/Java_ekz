public class Num_75 {
    public static void main(String[] args){
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println("0 division");
        } finally {
            System.out.println("Finally");
        }
    }
}
