import java.util.ArrayList;
import java.util.List;
public class Num_107 {
    public static void printList(List<?> list){
        for (Object element : list){
            System.out.println(element);
        }
    }
    public static void printNumbers(List<? extends Number> list){
        for (Number number : list){
            System.out.println(number);
        }
    }
    public static void addIntegers(List<? super  Integer> list){
        list.add(1);
        list.add(2);
    }
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        printList(stringList);
        printList(integerList);


        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(1);
        integerList1.add(2);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);

        printNumbers(integerList1);
        printNumbers(doubleList);


        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);

        for (Object number : numberList) {
            System.out.println(number);
        }
    }
}
