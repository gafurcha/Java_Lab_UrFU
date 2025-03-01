package Lab1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;

        System.out.println("Сумма: " + sum);

        scanner.close();
    }
}
