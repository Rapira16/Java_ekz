interface Box2<T>{
    void setItem(T item);
    T getItem();
}
class SimpleBox<T> implements Box2<T>{
    private T item;

    @Override
    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public T getItem() {
        return item;
    }
}
public class Num_106 {
    public static void main(String[] args){
        Box2<String> stringBox = new SimpleBox<>();
        stringBox.setItem("Opa");
        System.out.println(stringBox.getItem());

        Box2<Integer> integerBox = new SimpleBox<>();
        integerBox.setItem(52);
        System.out.println(integerBox.getItem());
    }
}
