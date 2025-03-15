package Lab2.animals;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }

    public void displayInfo() {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }
}
