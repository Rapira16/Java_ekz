public class Num_46 {
    public static void main(String[] args){
        String original = "GitHub";
        char[] charArray = original.toCharArray();
        for (char c : charArray) {
            System.out.println(c + " ");
        }
        String newString = String.valueOf(charArray);
        System.out.println(newString);
    }
}
