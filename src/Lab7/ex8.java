package Lab7;

import java.io.*;
import java.util.Date;

// Главный класс программы
public class ex8 {
    public static void main(String[] args) {
        // Создаем объект для сериализации
        Address2 address = new Address2("Москва", "Ленина");
        Person2 person = new Person2("Иван Иванов", 30, new Date(), address);

        // Имя файла для сохранения
        String filename = "person2.ser";

        // Сериализация объекта в файл
        serializePerson(person, filename);

        // Десериализация объекта из файла
        Person2 restoredPerson = deserializePerson(filename);

        // Вывод значений полей восстановленного объекта
        if (restoredPerson != null) {
            printPersonDetails(restoredPerson);
        }
    }

    // Метод для сериализации объекта Person2 в файл
    private static void serializePerson(Person2 person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Объект Person2 успешно записан в файл: " + filename);
            System.out.println("Исходный объект: " + person);
        } catch (IOException e) {
            System.err.println("Ошибка при сериализации: " + e.getMessage());
        }
    }

    // Метод для десериализации объекта Person2 из файла
    private static Person2 deserializePerson(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person2 restoredPerson = (Person2) ois.readObject();
            System.out.println("\nОбъект Person2 успешно восстановлен из файла: " + filename);
            System.out.println("Восстановленный объект: " + restoredPerson);
            return restoredPerson;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации: " + e.getMessage());
            return null;
        }
    }

    // Метод для вывода деталей объекта Person2
    private static void printPersonDetails(Person2 person) {
        System.out.println("\nЗначения полей восстановленного объекта Person2:");
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Дата рождения: " + person.getBirthDate()); // будет null, так как поле transient
        System.out.println("Адрес: " + person.getAddress());
    }
}

// Класс Person2, реализующий интерфейс Serializable
class Person2 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient Date birthDate; // Поле не будет сериализовано
    private Address2 address; // Вложенный объект тоже должен быть Serializable

    public Person2(String name, int age, Date birthDate, Address2 address) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.address = address;
    }

    // Геттеры для полей
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Address2 getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", address=" + address +
                '}';
    }
}

// Вложенный класс Address2, тоже Serializable
class Address2 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String city;
    private String street;

    public Address2(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address2{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}