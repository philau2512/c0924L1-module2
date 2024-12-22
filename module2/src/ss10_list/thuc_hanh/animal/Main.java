package ss10_list.thuc_hanh.animal;

import ss10_list.thuc_hanh.animal.controller.AnimalController;
import ss10_list.thuc_hanh.animal.view.ConsoleAnimalView;

public class Main {
    public static void main(String[] args) {
        ConsoleAnimalView animalView = new ConsoleAnimalView();
        AnimalController animalController = new AnimalController(animalView);

        animalController.addDog("baby dog");
        animalController.addCat("baby cat");

        animalController.showAnimal();
    }
}
