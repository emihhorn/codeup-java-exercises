package shapes;

public class Rectangle extends Quadrilateral{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width){
        this.width = width;
    }


//    protected int width;
//    protected int length;
//
//    protected int side;
//
//    public Rectangle(int widthIs, int lengthIs) {
//        this.width = widthIs;
//        this.length = lengthIs;
//    }
//
//    public int getArea() {
//        return width * length;
//    }
//
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }

    /* perimeter = 2 x length + 2 x width
        area = length x width*/

}
