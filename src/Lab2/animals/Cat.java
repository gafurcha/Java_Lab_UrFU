package Lab2.animals;

public class Cat extends Animal {
    private String favoriteFood;

    public Cat(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    public void groom() {
        System.out.println("Cat is grooming itself.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Favorite Food: " + favoriteFood);
    }
}
