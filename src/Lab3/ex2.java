package Lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        System.out.print("Двоичное число: ");
        toBinary(number);
    }

    public static void toBinary(int number) {
        if (number > 1) {
            toBinary(number / 2);
        }
        System.out.print(number % 2);
    }
}
