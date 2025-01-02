public class Num_28 {
    static int staticValue;
    static String staticMessage;
    static {
        staticValue = 52;
        staticMessage = "Ku";
        System.out.println("Static Block");
    }
    public static void displayValues(){
        System.out.println(staticValue);
        System.out.println(staticMessage);
    }
    public static void main(String[] args){
        displayValues();
    }
}
