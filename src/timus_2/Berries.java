import java.util.Scanner;

public class Berries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();

        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();

        int x = (a1 + a3 - a2) / 2; // Масса первого
        int y = (b1 + b3 - b2) / 2; // Масса второго

        // Вывод результата
        System.out.println(x + " " + y);
    }
}
