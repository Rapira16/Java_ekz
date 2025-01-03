class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

public class Num_73 {
    public static void main(String[] args){
        try {
            validateInput(-3);
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
    public static void validateInput(int value) throws MyException{
        if (value < 0){
            throw new MyException("Negative");
        }
        System.out.println("Good");
    }
}
