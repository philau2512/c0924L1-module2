package ss5.bai_tap.class_only_write;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("=====Trước khi set=====");
        System.out.println(student.getName());
        System.out.println(student.getClasses());

        System.out.println("=====Sau khi set=====");
        student.setName("Nguyen");
        student.setClasses("C0924L1");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
