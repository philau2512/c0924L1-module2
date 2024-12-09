package ss6_inheritance.bai_tap.point2d_3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    public float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public String getXYZ() {
        Float[] xyz = {super.getX(), super.getY(), this.z};
        return Arrays.toString(xyz);
    }

    @Override
    public String toString() {
        return super.toString() + "Point3D{" +
                "z=" + z +
                '}';
    }
}
