class StaticBlockExample{
    static int staticValue;
    static {
        staticValue = 10;
        System.out.println("Static block " + staticValue);
    }
}
class InstanceBlockExample{
    int instanceValue;
    {
        instanceValue = 20;
        System.out.println("Instance block " + instanceValue);
    }
}

public class Num_27 {
    public static void main(String[] args) {
        StaticBlockExample obj1 = new StaticBlockExample();
        InstanceBlockExample obj2 = new InstanceBlockExample();
    }
}