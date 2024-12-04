package ss4_object_class.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-this.b + Math.sqrt(delta)) / (2 * this.a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-this.b - Math.sqrt(delta)) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Enter number b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Enter number c: ");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        double delta = eq.getDiscriminant();
        if (delta > 0) {
            double root1 = eq.getRoot1();
            double root2 = eq.getRoot2();
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root1 = eq.getRoot1();
            System.out.println("The equation has one root: " + root1);
        } else {
            System.out.println("The equation has no real root");
        }

    }
}
