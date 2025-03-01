package Lab1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int birthYear = currentYear - age;

        System.out.println("Ваш год рождения: " + birthYear);

        scanner.close();
    }
}
