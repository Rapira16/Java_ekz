public class Num_35 {
    private int defaultValue;
    private int value;
    private static int staticValue;
    {
        defaultValue = 0;
    }
    static {
        staticValue = 1;
    }
    public Num_35(int value){
        this.value = value;
    }
    public void displayValues(){
        System.out.println(defaultValue);
        System.out.println(staticValue);
        System.out.println(value);
    }
    public static void main(String[] args){
        Num_35 example = new Num_35(10);
        example.displayValues();
    }
}
