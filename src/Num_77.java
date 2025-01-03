import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Num_77 {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
