package iuh;

public class ShapeFactory {
    static IShape getShape(String name) {
        if(name.equals("circle")) return new Circle();
        else if(name.equals("square")) return new Square();
        else return new Rectangle();
    }
}
