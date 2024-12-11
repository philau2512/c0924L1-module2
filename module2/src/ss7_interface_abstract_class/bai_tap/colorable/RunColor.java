package ss7_interface_abstract_class.bai_tap.colorable;

import ss7_interface_abstract_class.bai_tap.Circle;
import ss7_interface_abstract_class.bai_tap.Rectangle;
import ss7_interface_abstract_class.bai_tap.Shape;
import ss7_interface_abstract_class.bai_tap.Square;

public class RunColor {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(4, 5);

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.println("Original shape: " + shape);
                ((Colorable) shape).howToColor();
            } else {
                System.out.println("Original shape: " + shape);
                System.out.println("Shape is not colorable!");
            }
            System.out.println();
        }
    }
}
