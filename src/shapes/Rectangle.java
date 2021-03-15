package shapes;

public class Rectangle {

    protected int length;
    protected int width;
    protected int side;

    public Rectangle(int widthIs, int lengthIs) {
        this.width = widthIs;
        this.length = lengthIs;
    }

    public int getArea() {
        return width * length;
    }

    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }

    /* perimeter = 2 x length + 2 x width
        area = length x width

         Quick tip for the exercise: the Square class will NOT
         need an additional variable (no side variable required).
         The ‘side’ referred to in the exercise  can be derived
         from either length or width from the parent class.*/

}
