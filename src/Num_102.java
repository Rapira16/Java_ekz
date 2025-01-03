class Box1<T>{
    private T item;
    public  void  setItem(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
public class Num_102 {
    public  static void main(String[] args){
        Box1<String> stringBox = new Box1<>();
        stringBox.setItem("Kuku");
        System.out.println(stringBox.getItem());

        Box1<Integer> integerBox = new Box1<>();
        integerBox.setItem(228);
        System.out.println(integerBox.getItem());
    }
}
