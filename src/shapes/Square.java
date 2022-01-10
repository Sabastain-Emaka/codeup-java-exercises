package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }


    public double getPerimeter() {
        System.out.println("you got your square");
        return 4 * width;
    }


    public double getArea() {
        System.out.println("you got your square");
        return Math.pow(width, 2);
    }

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