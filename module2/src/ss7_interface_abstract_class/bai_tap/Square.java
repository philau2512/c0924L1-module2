package ss7_interface_abstract_class.bai_tap;

import ss7_interface_abstract_class.bai_tap.colorable.Colorable;
import ss7_interface_abstract_class.bai_tap.resizable.Resizeable;

public class Square extends Shape implements Colorable, Resizeable {
    private double side = 10.0;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side *= (1 + percent / 100);
    }
}
