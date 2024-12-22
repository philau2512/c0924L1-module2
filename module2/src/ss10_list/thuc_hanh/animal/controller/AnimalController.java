package ss10_list.thuc_hanh.animal.controller;

import ss10_list.thuc_hanh.animal.model.AnimalRepository;
import ss10_list.thuc_hanh.animal.model.Cat;
import ss10_list.thuc_hanh.animal.model.Dog;
import ss10_list.thuc_hanh.animal.model.IAnimal;
import ss10_list.thuc_hanh.animal.view.IAnimalView;

public class AnimalController {
    private IAnimalView animalView;

    public AnimalController(IAnimalView animalView) {
        this.animalView = animalView;
    }

    public void addDog(String dogName) {
        IAnimal dog = new Dog(dogName);
        AnimalRepository.addAnimal(dog);
    }

    public void addCat(String catName) {
        IAnimal cat = new Cat(catName);
        AnimalRepository.addAnimal(cat);
    }

    public void showAnimal() {
        animalView.displayAnimals(AnimalRepository.getAnimalList());
    }
}
