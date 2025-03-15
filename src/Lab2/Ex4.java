package Lab2;

public class Ex4 {
    public static void main(String[] args) {
        Person person = new Person("Иван", 25, "Мужской");
        System.out.println(person.displayInfo());

        person.setAge(26);
        System.out.println("После изменения возраста: " + person.displayInfo());
    }
}

