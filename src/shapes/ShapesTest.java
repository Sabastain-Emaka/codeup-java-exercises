package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape1 = new Square(4.0);
        Measurable myShape2  = new Rectangle(5, 10);

        Rectangle r1 = new Rectangle(3,10);
        r1.setLength(8);

        System.out.println("Square");
        System.out.println("Area: " + myShape1.getArea());
        System.out.println("Perimeter: " + myShape1.getPerimeter());
        System.out.println("===================");

        System.out.println("Rectangle");

        System.out.println("Area: " + myShape2.getArea());
        System.out.println("Perimeter: " + myShape2.getPerimeter());
        System.out.println("===================");

        System.out.println("Rectangle");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());




        // Solutions to exercise 1 on inheritance and polymorphism

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());

//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());


    }
}