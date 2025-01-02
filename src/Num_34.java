public class Num_34 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++){
            sb.append(i).append("\n");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
