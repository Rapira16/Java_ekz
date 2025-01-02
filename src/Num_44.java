public class Num_44 {
    public static void main(String[] args){
        String str1 = "Ku";
        String str2 = new String("Ku, epta");
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));

        System.out.println(str1.concat(str2));
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str2.substring(4, 7));
    }
}
