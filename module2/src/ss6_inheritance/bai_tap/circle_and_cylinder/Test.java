package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Circle circle = new Circle();

        System.out.println(circle);
        System.out.println(cylinder);

        System.out.println("Diện tích: "+ cylinder.caculateArea());
    }
}
