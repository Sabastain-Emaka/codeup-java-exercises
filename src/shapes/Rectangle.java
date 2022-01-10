package shapes;

public class Rectangle {

    public Rectangle( double l,  double w) {
        super(l, w);
    }


    public double getArea() {
        return this.length * this.width;
    }


    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

}
