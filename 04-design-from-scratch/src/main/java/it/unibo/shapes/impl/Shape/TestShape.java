package it.unibo.shapes.impl.Shape;

public class TestShape {
    public static void main(final String[] args){
        Circle circle1 = new Circle(5);
        Square square1 = new Square(4, 4);
        Rectangle rectangle1 = new Rectangle(4, 5, 6);
        Triangle triangle1 = new Triangle(3, 3, 4, 6);

        System.out.println(circle1.toString());
        System.out.println("");
        System.out.println(square1.toString());
        System.out.println("");
        System.out.println(rectangle1.toString());
        System.out.println("");
        System.out.println(triangle1.toString());
    }
}