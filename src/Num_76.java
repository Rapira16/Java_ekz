public class Num_76 {
    public static void main(String[] args){
        try {
            methodA();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void methodA() throws Exception{
        methodB();
    }
    public static void methodB() throws Exception{
        throw new Exception("methodB exception");
    }
}
