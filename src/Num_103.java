import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Num_103 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Tumba");
        names.add("Yumba");
        names.add("Nigga");

        for (String name : names){
            System.out.println(name);
        }

        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Tumba", 40);
        ageMap.put("Yumba", 30);
        ageMap.put("Nigga", 228);
        for (String name : ageMap.keySet()){
            Integer age = ageMap.get(name);
            System.out.println(name + " - " + age);
        }

        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Tumba");
        uniqueNames.add("Yumba");
        uniqueNames.add("Nigga");
        uniqueNames.add("Yumba");

        for (String name : uniqueNames){
            System.out.println(name);
        }
    }
}
