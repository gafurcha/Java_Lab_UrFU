package Lab7;

import java.io.File;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            System.out.println("Размер файла: " + file.length() + " байт(а)");
        } else {
            System.out.println("Файл не найден или это не файл.");
        }
    }
}
