import java.util.Date;
public class Num_62 {
    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 20;
        System.out.println(num1.compareTo(num2));

        String str1 = "Apple";
        String str2 = "Banana";
        System.out.println(str1.compareTo(str2));

        Date date1 = new Date(1633036800000L);
        Date date2 = new Date(1635724800000L);
        System.out.println(date1.compareTo(date2));
    }
}
