package ss10_list.thuc_hanh.animal.model;

public class Dog implements IAnimal{
    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating a bone.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
