package ss6_inheritance.bai_tap.point_and_movablepoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(11.0f, 12.5f, 0.5f, 0.7f);
        System.out.println("Before move: " + moveablePoint);
        System.out.println("Start move with: " + moveablePoint.getSpeed());
        moveablePoint.move();
        System.out.println("After move: " + moveablePoint);
    }
}
