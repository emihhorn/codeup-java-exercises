package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public int getPerimeter() {
        return 4 * side;
    }
}
