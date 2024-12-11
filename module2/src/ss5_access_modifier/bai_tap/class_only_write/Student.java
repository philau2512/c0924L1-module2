package ss5_access_modifier.bai_tap.class_only_write;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public String getName() {
        return name;
    }
}
