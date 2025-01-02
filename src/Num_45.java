public class Num_45 {
    public static void main(String[] args){
        String original = "Pepsi,Cola";
        String replace = original.replace('l', 'k');
        System.out.println(replace);
        String[] drinks = original.split(",");
        for (String drink : drinks){
            System.out.println(drink);
        }
    }
}
