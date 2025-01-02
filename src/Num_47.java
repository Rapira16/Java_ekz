public class Num_47 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Ku");
        sb.append(", epta");
        System.out.println(sb.toString());
        sb.insert(2, "plinov");
        System.out.println(sb.toString());
        sb.replace(2, 8, " Marmok");
        System.out.println(sb.toString());
        sb.delete(1, 7);
        System.out.println(sb.toString());
    }
}
