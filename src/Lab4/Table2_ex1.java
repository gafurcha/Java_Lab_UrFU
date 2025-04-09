package Lab4;

import java.util.Scanner;

public class Table2_ex1 {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите размер массива:");
            int size = Integer.parseInt(scanner.nextLine());

            int[] array = new int[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
            }

            int sum = 0;
            int count = 0;
            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Положительных элементов в массиве нет.");
            }

            System.out.println("Среднее значение положительных элементов: " + (double) sum / count);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: было введено нечисловое значение.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
}
