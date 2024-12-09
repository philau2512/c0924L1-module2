package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    public double height = 3;
    public double area;

    public Cylinder(double radius, String color, double height, double area) {
        super(radius, color);
        this.height = height;
        this.area = area;
    }

    public Cylinder() {

    }

    public double caculateArea() {
        return super.getRadius() * super.getRadius() * Math.PI * height;
    }
    @Override
    public String toString() {
        return super.toString() + "Cylinder{" +
                "height=" + height +
                ", area=" + area +
                '}';
    }
}
