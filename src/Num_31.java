final class Point2{
    private final int x;
    private final int y;
    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

public class Num_31 {
    public static void main(String[] args){
        Point2 point = new Point2(1, 2);
        System.out.println(point.getX() + ", " + point.getY());
    }
}
