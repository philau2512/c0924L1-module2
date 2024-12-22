package ss10_list.thuc_hanh.animal.model;

public class Cat implements IAnimal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
