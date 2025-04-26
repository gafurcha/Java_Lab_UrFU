package Lab5.timus5;

import java.util.Scanner;
public class Task_1044 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int half = N / 2;

            // Максимально возможная сумма для половины цифр (все цифры 9)
            int maxSum = 9 * half;

            // Массив для хранения количества комбинаций для каждой возможной суммы
            long[] count = new long[maxSum + 1];

            // Инициализация: одна комбинация для суммы 0 (все цифры 0)
            count[0] = 1;

            // Заполняем массив count для половины цифр
            for (int i = 0; i < half; i++) {
                long[] newCount = new long[maxSum + 1];
                for (int sum = 0; sum <= maxSum; sum++) {
                    if (count[sum] > 0) {
                        for (int digit = 0; digit <= 9; digit++) {
                            if (sum + digit <= maxSum) {
                                newCount[sum + digit] += count[sum];
                            }
                        }
                    }
                }
                count = newCount;
            }

            // Суммируем квадраты количеств комбинаций для каждой суммы
            long total = 0;
            for (int sum = 0; sum <= maxSum; sum++) {
                total += count[sum] * count[sum];
            }

            System.out.println(total);
        }
    }
