import java.util.ArrayList;
import java.util.List;
public class Num_105 {
    public static <T extends Number> void printNumbers(List<T> numbers){
        for (T number : numbers){
            System.out.println(number);
        }
    }
    public static void main(String[] args){
        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(2);
        intList.add(8);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(2.2);
        doubleList.add(2.2);
        doubleList.add(8.8);

        printNumbers(intList);
        printNumbers(doubleList);
    }
}
