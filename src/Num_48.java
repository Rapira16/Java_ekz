class Person4{
    private String name;
    private int age;
    public Person4(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return name + " " + age;
    }
}

public class Num_48 {
    public static void main(String[] args) {
        int intValue = 52;
        String intString = String.valueOf(intValue);
        System.out.println(intString);
        Person4 person = new Person4("Han", 120);
        System.out.println(person.toString());
        System.out.println(person);
    }
}
