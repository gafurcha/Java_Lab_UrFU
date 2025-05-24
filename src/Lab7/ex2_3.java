package Lab7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex2_3 {
    public static void main(String[] args) {
        // Запись данных в файл
        String fileName = "src/lr8/example3/example_file.txt";

        // Ввод данных с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные для записи в файл: ");
        String data = scanner.nextLine();

        try {
            // Создание директорий, если их нет
            File file = new File(fileName);
            file.getParentFile().mkdirs();

            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Чтение данных из файла
        try (FileReader reader = new FileReader(fileName)) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Удаление файла
        if (new File(fileName).delete()) {
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}
