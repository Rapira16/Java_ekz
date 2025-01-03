import java.util.LinkedList;
public class Num_111 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.addFirst("Zara");

        names.addLast("David");

        System.out.println("Список имен: " + names);

        names.removeFirst();
        System.out.println("После удаления первого элемента: " + names);

        names.removeLast();
        System.out.println("После удаления последнего элемента: " + names);

        String secondName = names.get(1);
        System.out.println("Второе имя: " + secondName);
    }
}
