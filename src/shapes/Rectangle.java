package shapes;

public class Rectangle {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

}


