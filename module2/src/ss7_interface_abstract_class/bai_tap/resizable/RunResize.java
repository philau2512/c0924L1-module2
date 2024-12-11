package ss7_interface_abstract_class.bai_tap.resizable;

import ss7_interface_abstract_class.bai_tap.Circle;
import ss7_interface_abstract_class.bai_tap.Rectangle;
import ss7_interface_abstract_class.bai_tap.Shape;
import ss7_interface_abstract_class.bai_tap.Square;

public class RunResize {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Circle(2);
        shapes[3] = new Square(6);

        for (Shape shape : shapes) {
            double percent = Math.random() * 100 + 1;
            System.out.println("Original shape: " + shape);
            System.out.println("Area before resize: " + getArea(shape));

            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
                System.out.println("Resize by " + percent + " %");
            } else {
                System.out.println("Shape is not resizeable!");
            }
            System.out.println("Area after resize: " + getArea(shape));
            System.out.println();
        }
    }

    public static double getArea(Shape shape) {
        if (shape instanceof Circle) {
            return ((Circle) shape).getArea(); // đang Shape phải ép kiểu về kiểu con Circle ( supertype -> subtype )
        } else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getArea();
        } else if (shape instanceof Square) {
            return ((Square) shape).getArea();
        }
        return 0.0;
    }
}
