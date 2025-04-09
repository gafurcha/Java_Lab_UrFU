package Lab4.timus4;

import java.util.Scanner;
import java.util.Locale;

public class Task1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Устанавливаем локаль для точки как десятичного разделителя

        try {
            // Ввод данных
            double P = scanner.nextDouble();
            double Q = scanner.nextDouble();

            // Проверка корректности ввода
            if (P >= 100 || Q >= 100 || P >= Q) {
                System.out.println("Неверные входные данные");
                return;
            }

            // Минимальное число жителей
            int n = 1;
            while (true) {
                // Проверим количество водителей для данного n
                int lowerBound = (int) Math.ceil(n * P / 100); // Минимально необходимое число водителей
                int upperBound = (int) Math.floor(n * Q / 100); // Максимально допустимое число водителей

                // Если между нижней и верхней границей есть хотя бы одно целое число
                if (lowerBound > 0 && lowerBound <= upperBound) {
                    System.out.println(n);
                    break;
                }

                // Увеличиваем количество жителей
                n++;
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Используйте точку как десятичный разделитель.");
        } finally {
            scanner.close();
        }
    }
}