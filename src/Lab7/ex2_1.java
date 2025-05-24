package Lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex2_1 {
    public static void main(String[] args) {
        // Создание папки (создадутся все промежуточные каталоги)
        File folder = new File("src/l7g/example1/example_folder");
        if (!folder.exists()) {
            if (folder.mkdirs()) {
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " + folder.getAbsolutePath());
                return;
            }
        } else {
            System.out.println("Папка уже существует: " + folder.getAbsolutePath());
        }

        // Создание файла внутри папки
        File file = new File(folder.getAbsolutePath()
                + File.separator
                + "example_file.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Файл уже существует: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
            return;
        }

        // Ввод данных с консоли и запись в файл
        try (Scanner scanner = new Scanner(System.in);
             FileWriter fw = new FileWriter(file, false)) {
            System.out.print("Введите строку для записи в файл: ");
            String input = scanner.nextLine();
            fw.write(input);
            System.out.println("Ваши данные успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }

        // Удаление файла и папки
        if (file.delete()) {
            System.out.println("Файл удалён: " + file.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить файл: " + file.getAbsolutePath());
        }

        if (folder.delete()) {
            System.out.println("Папка удалена: " + folder.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить папку: " + folder.getAbsolutePath());
        }
    }
}
