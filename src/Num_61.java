import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Person61 implements Comparable<Person61>{
    private String name;
    private int age;
    public Person61(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person61 other){
        return this.age - other.age;
    }
    @Override
    public String toString(){
        return name + " " + age;
    }
}
public class Num_61 {
    public static void main(String[] args){
        List<Person61> people = new ArrayList<>();
        people.add(new Person61("Tito", 64));
        people.add(new Person61("Joseph", 56));
        people.add(new Person61("Vladimir", 45));
        Collections.sort(people);
        for (Person61 person : people){
            System.out.println(person.toString());
        }
    }
}
