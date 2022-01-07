package shapes;

public class Square{

    public Square(Double side) {
        super(side, side);
    }
    @Override
    public  double getPerimeter(){
        return 4 * width;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }

}
