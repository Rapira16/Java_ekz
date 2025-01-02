import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Person3{
    private String name;
    private int age;

    public Person3(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println(name + " " + age);
    }
}

public class Num_33 {
    public static void main(String[] args){
        try {
            Class<?> personClass = Class.forName("Person3");
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            Object person = constructor.newInstance("Dimitry", 40);
            Method displayMethod = personClass.getMethod("displayInfo");
            displayMethod.invoke(person);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
