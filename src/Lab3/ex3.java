package Lab3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        inputArray(scanner, array, 0);

        System.out.print("Введенный массив: ");
        outputArray(array, 0);

        scanner.close();
    }

    public static void inputArray(Scanner scanner, int[] array, int index) {
        if (index < array.length) {
            array[index] = scanner.nextInt();
            inputArray(scanner, array, index + 1);
        }
    }

    public static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            outputArray(array, index + 1);
        }
    }
}
