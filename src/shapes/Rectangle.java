package shapes;

public class Rectangle extends  Quadrilateral implements  Measurable{


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void set_length(double _length) {
        this._length = _length;
    }

    public double get_length() {
        return this._length;
    }

    @Override
    public void set_width(double _width) {
        this._width = _width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this._length) + (2 * this._width);
    }

    @Override
    public double getArea() {
        return (this._length * this._width);
    }





    // Solution to exercise 1 on Inheritance and Polymorphism
//    protected double length;
//    protected double width;
//
//    public Rectangle( double length,  double width) {
//        this.length = length;
//        this. width = width;
//    }
//
//
//    public double getArea() {
//        return this.length * this.width;
//    }
//
//
//    public double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }

}


// instructor's solution to the exercise

//
//package shapes;
//
//public class Rectangle {
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        return this.length * this.width;
//    }
//
//    public double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }
//}