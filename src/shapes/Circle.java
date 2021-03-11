package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        //pi x (radius ^ 2);
        return Math.PI * Math.pow(this.radius, 2);
    }
//    public double getCircumference()


}
