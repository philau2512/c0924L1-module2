package ss6_inheritance.bai_tap.point2d_3d;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        point2D.setX(10);
        point2D.setY(20);
        point3D.setX(10);
        System.out.println(point2D.getX());
        System.out.println(point3D.getY());

        point3D.setZ(10.5f);
        System.out.println(point3D.getXYZ());
        System.out.println(point2D);
        System.out.println(point3D);
    }
}
