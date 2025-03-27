package Lab3.timus_3;

import java.util.*;
import java.awt.geom.Point2D;

public class Task1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Устанавливаем локаль для корректного чтения double

        int N = scanner.nextInt();
        double R = scanner.nextDouble();

        // Читаем координаты гвоздей
        Point2D.Double[] nails = new Point2D.Double[N];
        for (int i = 0; i < N; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            nails[i] = new Point2D.Double(x, y);
        }

        // Вычисляем периметр
        double perimeter = 0.0;
        for (int i = 0; i < N; i++) {
            Point2D.Double current = nails[i];
            Point2D.Double next = nails[(i + 1) % N];
            perimeter += current.distance(next);
        }

        // Добавляем длину окружности
        double totalLength = perimeter + 2 * Math.PI * R;

        // Выводим результат с округлением
        System.out.printf(Locale.US, "%.2f", totalLength);
    }
}