class GenericMethods{
    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element);
        }
    }
}
public class Num_104 {
    public static void main(String[] args){
        String[] names = {"Chukcha", "Churka", "Tundra"};
        GenericMethods.printArray(names);

        Integer[] numbers = {1,2,3,4,5};
        GenericMethods.printArray(numbers);
    }
}
