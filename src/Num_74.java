public class Num_74 {
    public static void main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());
            int result = 10 / 0;
        } catch (NullPointerException e){
            System.out.println("Null error");
        } catch (ArithmeticException e){
            System.out.println("0 division");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
