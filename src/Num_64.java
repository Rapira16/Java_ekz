class Person64 implements Cloneable{
    private String name;
    private int age;
    public Person64(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return name + " " + age;
    }
}
public class Num_64 {
    public static void main(String[] args){
        try {
            Person64 original = new Person64("Igor", 28);
            Person64 cloned = (Person64) original.clone();
            System.out.println(original);
            System.out.println(cloned);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
