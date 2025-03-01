package Lab1;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt();
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int age = currentYear - birthYear;

        System.out.println(name + ", ваш возраст: " + age);

        scanner.close();
    }
}
