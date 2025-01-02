interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Square");
    }
}

class ShapeFactory{
    public static Shape createShape(String shapeType){
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

public class Num_32 {
    public static void main(String[] args){
        Shape circle = ShapeFactory.createShape("CIRCLE");
        circle.draw();
        Shape square = ShapeFactory.createShape("SQUARE");
        square.draw();
    }
}
