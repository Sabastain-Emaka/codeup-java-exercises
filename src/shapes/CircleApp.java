//package shapes;
//
//import util.Input;
//
//public class CircleApp {
//    public static void main(String[] args) {
//        Input input = new Input();
//        do {
//            double radius = input.getDouble("What is the radius of a circle?");
//            Circle circle = new Circle(radius);
//            System.out.println("Area of circle = " + circle.getArea());
//            System.out.println("Circumference = " + circle.getCircumference());
//            //        System.out.println(circle.radius); // no access
//        } while (input.yesNo("Let us make another one"));
//        System.out.println(Circle.getCirclesCreated() + " circles created.");
//    }
//}


package shapes;

import BirdHaven.Bird;
import util.Input;

public class CircleApp {

    public static void circleCreator() {
        Input in = new Input();
        int count = 0;

        do {
            Circle circle = new Circle(in.getDouble("Please enter in the radius for a circle."));
            System.out.printf("The area of a circle with a radius value of %f is: %f\n", circle.getRadius(), circle.getArea());
            System.out.printf("The circumference of a circle with a radius value of %f is: %f", circle.getRadius(), circle.getCircumference());
            count++;
            System.out.println(count + " circle(s) made.");
        } while (in.yesNo("Would you like to create another circle?"));
    }

//    public static void circleCreator() {
//        Input in = new Input();
//        Circle.count += 1;
//        Circle circle = new Circle(in.getDouble("Please enter in the radius for a circle."));
//        System.out.printf("The area of a circle with a radius value of %f is: %f\n", circle.getRadius(), circle.getArea());
//        System.out.printf("The circumference of a circle with a radius value of %f is: %f\n", circle.getRadius(), circle.getCircumference());
//        System.out.println(Circle.count + " circle(s) made.");
//
//        if(in.yesNo()) {
//            circleCreator();
//        } else {
//            return;
//        }
//    }

    public static void main(String[] args) {
        Circle c1 = new Circle(4);
//        System.out.println(c1.getArea());
//
//        System.out.println(c1.getCircumference());
        circleCreator();


    }
}