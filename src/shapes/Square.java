package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getArea() {
//        return side * side;
//    }
//
//    public int getPerimeter() {
//        return 4 * side;
//    }
}
