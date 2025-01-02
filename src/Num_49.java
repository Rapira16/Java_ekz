public class Num_49 {
    public static void main(String[] args){
        String str1 = new String("Ku").intern();
        String str2 = "Ku";
        System.out.println(str1 == str2);
        String str3 = new String("Ku");
        System.out.println(str1 == str3);
    }
}
