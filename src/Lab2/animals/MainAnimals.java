package Lab2.animals;

public class MainAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayInfo();
        dog.makeSound();
        dog.wagTail();

        System.out.println();

        Cat cat = new Cat("Whiskers", 2, "Fish");
        cat.displayInfo();
        cat.makeSound();
        cat.groom();

        System.out.println();

        Bird bird = new Bird("Tweety", 1, true);
        bird.displayInfo();
        bird.makeSound();
        bird.fly();
    }
}
