package shapes;


public abstract class Quadrilateral implements Shape {

    //TODO: Inside of shapes, create
    // an abstract Quadrilateral class that implements Shape.
    // This class should have -> protected double fields for length
    // and width. ***include data type***-> a constructor that accepts
    // two doubles for the length and width and sets those fields.
    //    -> abstract methods for setting the length and width.


    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);

    public double getArea(){
       return(this.length * this.width);
    }
    public double getPerimeter(){
       return ((this.length * 2) + (this.width * 2));
    }
}
