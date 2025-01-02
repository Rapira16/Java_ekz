// Класс Person
class Person2 {
    private String name;
    private int age;

    // Конструктор с двумя параметрами
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Конструктор с одним параметром
    public Person2(String name) {
        this(name, 0); // Вызов другого конструктора
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Класс Animal
class Animal {
    private String name;

    // Конструктор родительского класса
    public Animal(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}

// Подкласс Dog
class Dog extends Animal {
    private String breed;

    // Конструктор подкласса
    public Dog(String name, String breed) {
        super(name); // Вызов конструктора родительского класса
        this.breed = breed;
    }

    public void displayInfo() {
        super.displayInfo(); // Вызов метода родительского класса
        System.out.println("Breed: " + breed);
    }
}

// Класс с методом main
public class Num_26 {
    public static void main(String[] args) {
        // Создание объектов класса Person
        Person2 person1 = new Person2("Alice", 30);
        Person2 person2 = new Person2("Bob");

        // Вывод информации о Person
        person1.displayInfo(); // Вывод: Name: Alice, Age: 30
        person2.displayInfo(); // Вывод: Name: Bob, Age: 0

        // Создание объекта класса Dog
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.displayInfo(); // Вывод: Animal Name: Buddy, Breed: Golden Retriever
    }
}