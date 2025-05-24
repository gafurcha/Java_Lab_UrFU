package Lab7.timus7;

import java.util.Scanner;

public class Task2100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества друзей
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        int guests = 2; // Маршалл и Лили

        // Обработка ответов от друзей
        for (int i = 0; i < n; i++) {
            String response = scanner.nextLine();
            if (response.contains("+one")) {
                guests += 2; // друг + пара
            } else {
                guests += 1; // только друг
            }
        }

        // Проверка на 13 гостей
        if (guests == 13) {
            guests += 1; // добавляем манекен
        }

        // Расчет стоимости
        int cost = guests * 100;
        System.out.println(cost);
    }
}