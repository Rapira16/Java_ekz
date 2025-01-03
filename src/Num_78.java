import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Num_78 {
    public static void main(String[] args){
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}