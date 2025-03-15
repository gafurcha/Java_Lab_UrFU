package Lab2.animals;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp! Chirp!");
    }

    public void fly() {
        if (canFly) {
            System.out.println("Bird is flying!");
        } else {
            System.out.println("This bird can't fly.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Can Fly: " + canFly);
    }
}
