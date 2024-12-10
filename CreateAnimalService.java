import java.util.ArrayList;
import java.util.List;

public class CreateAnimalService {

    private List<AbstractAnimal> animals = new ArrayList<>();

    // Метод для создания 10 уникальных животных
    public void createDefaultAnimals() {
        int count = 0;
        while (count < 10) {
            AbstractAnimal animal = createRandomAnimal();
            animals.add(animal);
            System.out.println("Создано животное: " + animal.getName());
            count++;
        }
    }

    // Перегруженный метод для создания N животных
    public void createAnimals(int n) {
        for (int i = 0; i < n; i++) {
            AbstractAnimal animal = createRandomAnimal();
            animals.add(animal);
            System.out.println("Создано животное: " + animal.getName());
        }
    }

    // Переопределенный метод для создания N животных с использованием do-while
    public void createAnimalsDoWhile(int n) {
        int count = 0;
        do {
            AbstractAnimal animal = createRandomAnimal();
            animals.add(animal);
            System.out.println("Создано животное: " + animal.getName());
            count++;
        } while (count < n);
    }

    // Метод для создания случайного животного
    private AbstractAnimal createRandomAnimal() {
        double randomCost = Math.random() * 1000 + 100;
        String randomCharacter = Math.random() > 0.5 ? "Friendly" : "Aggressive";

        switch ((int)(Math.random() * 4)) {
            case 0:
                return new Dog("Buddy", randomCost, randomCharacter);
            case 1:
                return new Cat("Whiskers", randomCost, randomCharacter);
            case 2:
                return new Wolf("Grey", randomCost, randomCharacter);
            case 3:
                return new Shark("Jaws", randomCost, randomCharacter);
            default:
                return null; // Не должно произойти
        }
    }
}
