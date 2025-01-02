class OverloadedConstructorExample{
    int value;
    String name;
    public OverloadedConstructorExample(){
        this.value = 0;
        this.name = "Default";
    }
    public OverloadedConstructorExample(int value){
        this.value = value;
        this.name = "Default";
    }
    public OverloadedConstructorExample(int value, String name){
        this.value = value;
        this.name = name;
    }
}

public class Num_25 {
    public  static void main(String[] args){
        OverloadedConstructorExample obj1 = new OverloadedConstructorExample();
        OverloadedConstructorExample obj2 = new OverloadedConstructorExample(3);
        OverloadedConstructorExample obj3 = new OverloadedConstructorExample(7, "opa");
        System.out.println(obj1.value + " " + obj1.name);
        System.out.println(obj2.value + " " + obj2.name);
        System.out.println(obj3.value + " " + obj3.name);
    }
}
