public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService();

        // Создание 10 уникальных животных
        createAnimalService.createDefaultAnimals();

        // Создание N животных (например, 5)
        createAnimalService.createAnimals(5);

        // Создание N животных с помощью do-while (например, 3)
        createAnimalService.createAnimalsDoWhile(3);
    }
}
