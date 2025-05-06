package lab6.timus6;

import java.util.*;

public class Task1397 {
    static class Point {
        double x, y;
        Point(double x, double y) { this.x = x; this.y = y; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            Point[] points = new Point[2 * n];
            for (int i = 0; i < 2 * n; ++i) {
                points[i] = new Point(sc.nextDouble(), sc.nextDouble());
            }
            double res = solve(points, n);
            System.out.printf("%.3f\n", res);
        }
    }

    // Решение переборное, т.к. n <= 500 и можно жадно брать самые "отдалённые" точки
    static double solve(Point[] points, int n) {
        List<Double> dists = new ArrayList<>();
        for (int i = 0; i < 2 * n; ++i) {
            for (int j = i + 1; j < 2 * n; ++j) {
                double dx = points[i].x - points[j].x;
                double dy = points[i].y - points[j].y;
                dists.add(Math.hypot(dx, dy));
            }
        }
        // Просто берём максимальные расстояния для первого игрока, минимальные для второго
        Collections.sort(dists, Collections.reverseOrder());
        double first = 0, second = 0;
        for (int i = 0; i < dists.size(); ++i) {
            if (i % 2 == 0) first += dists.get(i);
            else second += dists.get(i);
        }
        return Math.abs(first - second);
    }
}

