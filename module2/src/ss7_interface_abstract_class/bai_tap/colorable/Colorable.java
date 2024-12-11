package ss7_interface_abstract_class.bai_tap.colorable;

public interface Colorable {
    default void howToColor() {
        System.out.println("Color all four sides");
    };
}
