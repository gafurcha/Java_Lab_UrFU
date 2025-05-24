package Lab7.timus7;

import java.util.Scanner;

public class Task2101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение координат точек
        Point A = readPoint(scanner);
        Point B = readPoint(scanner);
        Point C = readPoint(scanner);
        Point P = readPoint(scanner);

        // Находим решение
        Solution solution = findMaxRectangle(A, B, C, P);

        // Вывод результатов
        System.out.printf("%.10f%n", solution.maxArea);
        System.out.println(solution.count);
    }

    private static Point readPoint(Scanner scanner) {
        return new Point(scanner.nextInt(), scanner.nextInt());
    }

    private static Solution findMaxRectangle(Point A, Point B, Point C, Point P) {
        double maxArea = 0.0;
        int count = 0;

        // Алгоритм поиска прямоугольников:
        // 1. Находим уравнения сторон треугольника
        // 2. Генерируем возможные прямоугольники
        // 3. Проверяем, что P лежит на границе
        // 4. Вычисляем площадь и подсчитываем

        // В реальной реализации нужно использовать геометрические вычисления
        // для нахождения всех возможных прямоугольников

        return new Solution(maxArea, count);
    }

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Solution {
        double maxArea;
        int count;
        Solution(double maxArea, int count) {
            this.maxArea = maxArea;
            this.count = count;
        }
    }
}