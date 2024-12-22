package ss10_list.thuc_hanh.animal.view;

import ss10_list.thuc_hanh.animal.model.IAnimal;

import java.util.List;

public class ConsoleAnimalView implements IAnimalView{

    @Override
    public void displayAnimals(List<IAnimal> animals) {
        System.out.println("=== Animal List ===");
        for (IAnimal animal : animals) {
            System.out.println("Name: " + animal.getName());
            animal.eat();
            animal.makeSound();
        }
    }
}
