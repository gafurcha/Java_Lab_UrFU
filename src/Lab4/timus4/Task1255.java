package Lab4.timus4;

import java.util.Scanner;

public class Task1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считывание размеров кладбища и гроба
        int N = scanner.nextInt(); // Размер стороны кладбища
        int K = scanner.nextInt(); // Размер стороны гроба

        // Количество гробов по ширине и высоте
        int gravesPerRow = N / K; // Сколько гробов помещается по одной стороне
        int gravesPerColumn = N / K; // Сколько гробов помещается по другой стороне

        // Общее количество гробов
        int totalGraves = gravesPerRow * gravesPerColumn;

        // Вывод результата
        System.out.println(totalGraves);
    }
}
