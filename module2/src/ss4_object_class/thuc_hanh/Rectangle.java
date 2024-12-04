package ss4_object_class.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "rectangle {" + this.width + ", " + this.height + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the height of the rectangle: ");
        double height = Double.parseDouble(sc.nextLine());

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());

        System.out.println("Area is: " + rectangle.getArea());
        System.out.println("Perimeter is: " + rectangle.getPerimeter());
    }
}
