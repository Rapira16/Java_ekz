import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Person63 implements Comparable<Person63>{
    private String name;
    private int age;
    public Person63(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person63 other){
        return this.name.compareTo(other.name);
    }
    @Override
    public String toString(){
        return name + " " + age;
    }
}
public class Num_63 {
    public static void main(String[] args){
        List<Person63> people = new ArrayList<>();
        people.add(new Person63("Alice", 30));
        people.add(new Person63("Bob", 25));
        people.add(new Person63("Charlie", 35));

        // Сортировка списка по имени
        Collections.sort(people);

        // Вывод отсортированного списка
        for (Person63 person : people) {
            System.out.println(person);
        }
    }
}
