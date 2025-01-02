// Пример объединенного файла, который охватывает наследование, ключевое слово super и цепочку конструкторов

// Суперкласс Animal
class Animal6 {
    private String type;

    // Конструктор суперкласса
    public Animal6(String type) {
        this.type = type;
        System.out.println("Animal created: " + type);
    }

    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Подкласс Dog
class Dog6 extends Animal6 {
    private String name;

    // Конструктор подкласса, использующий super()
    public Dog6(String name) {
        super("Dog"); // Вызов конструктора суперкласса
        this.name = name;
        System.out.println("Dog created: " + name);
    }

    @Override
    public void sound() {
        super.sound(); // Вызов метода суперкласса
        System.out.println("Woof!");
    }
}

// Класс Person
class Person5 {
    private String name;
    private int age;

    // Конструктор с двумя параметрами
    public Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Конструктор с одним параметром, использующий this()
    public Person5(String name) {
        this(name, 0); // Вызов конструктора с двумя параметрами
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Главный класс для демонстрации
public class Num_54 {
    public static void main(String[] args) {
        // Пример использования класса Dog
        Dog6 dog = new Dog6("Buddy");
        dog.sound(); // Вывод: Animal created: Dog
        //         Dog created: Buddy
        //         Animal makes a sound.
        //         Woof!

        // Пример использования класса Person
        Person5 person1 = new Person5("Alice", 30);
        Person5 person2 = new Person5("Bob");

        person1.display(); // Вывод: Name: Alice, Age: 30
        person2.display(); // Вывод: Name: Bob, Age: 0
    }
}