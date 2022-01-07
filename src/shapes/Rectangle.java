package shapes;

public class Rectangle extends Quadrilateral {

    public  Rectangle(double length, double width) {
        super(length, width);

    }

    @Override
    public  double grtPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public  double getArea () {
        return this.width * this.length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    void setLength(double length){
        this.length = length;
    }



}
