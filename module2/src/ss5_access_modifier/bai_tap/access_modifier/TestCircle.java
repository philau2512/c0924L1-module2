package ss5_access_modifier.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circler = new Circle();
        System.out.println("=== Test Circle before===");
        System.out.println(circler.getRadius());
        System.out.println(circler.getColor());

        System.out.println("=== Test Circle after===");
        circler.setRadius(10);
        circler.setColor("blue");
        System.out.println(circler.getRadius());
        System.out.println(circler.getColor());
    }
}
