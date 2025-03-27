package Lab3.timus_3;

import java.util.Scanner;

public class Task2056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества экзаменов
        int n = scanner.nextInt();

        // Чтение оценок
        int[] grades = new int[n];
        boolean hasThrees = false;
        boolean allFives = true;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
            if (grades[i] == 3) {
                hasThrees = true;
            }
            if (grades[i] != 5) {
                allFives = false;
            }
            sum += grades[i];
        }

        // Вычисление среднего балла
        double average = (double) sum / n;

        // Определение стипендии
        if (hasThrees) {
            System.out.println("None");
        } else if (allFives) {
            System.out.println("Named");
        } else if (average >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}