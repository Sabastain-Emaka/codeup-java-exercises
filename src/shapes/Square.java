package shapes;

public class  Square extends  Quadrilateral{

    public Square(double sides) {
        super(sides,sides);
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.width * this.length;

    }

    @Override
    void setLength(double length) {
        this.length = length;

    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }



    // Solution to exercise 1, Inheritance and polymorphism

    //public class Square extends Rectangle {
//    public Square(double side) {
//        super(side, side);
//    }
//
//
//    public double getPerimeter() {
//        System.out.println("you got your square");
//        return 4 * width;
//    }
//
//
//    public double getArea() {
//        System.out.println("you got your square");
//        return Math.pow(width, 2);
//    }

}


 // instructor's solution to the exercise

//package shapes;
//
//public class Square extends Rectangle{
//
//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getArea() {
//        System.out.println("This is a square.");
//        return Math.pow(super.length, 2);
//    }
//
//    public double getPerimeter() {
//        System.out.println("This is a square.");
//        return 4 * super.length;
//    }
//}