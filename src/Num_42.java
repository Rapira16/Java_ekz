public class Num_42 {
    public static void main(String[] args){
        String numberString = "123";
        int number = Integer.parseInt(numberString);
        Integer wrappedNum = number;
        System.out.println(number);

        String numberString2 = "045";
        Integer wrappedFromString = Integer.valueOf(numberString2);
        System.out.println(wrappedFromString);

        System.out.println(wrappedNum.compareTo(wrappedFromString));
    }
}
