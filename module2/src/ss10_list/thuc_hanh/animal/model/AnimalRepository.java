package ss10_list.thuc_hanh.animal.model;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    private static List<IAnimal> animalList = new ArrayList<>();

    public static void addAnimal(IAnimal animal) {
        animalList.add(animal);
    }

    public static List<IAnimal> getAnimalList() {
        return animalList;
    }
}
