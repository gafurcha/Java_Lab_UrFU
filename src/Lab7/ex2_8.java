package Lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex2_8 {
    public static void main(String[] args) {
        String dirPath = "C:\\Users\\gafur\\IdeaProjects\\MyFirstApp\\src\\lr8\\example7";
        String filePath = dirPath + "\\input.txt";

        try {
            // Создаём папки, если их нет
            File dir = new File(dirPath);
            if (!dir.exists()) {
                boolean dirsCreated = dir.mkdirs();
                if (dirsCreated) {
                    System.out.println("Папки успешно созданы: " + dirPath);
                } else {
                    System.out.println("Не удалось создать папки: " + dirPath);
                    return;
                }
            } else {
                System.out.println("Папки уже существуют: " + dirPath);
            }

            // Создаём или перезаписываем файл input.txt
            File file = new File(filePath);
            if (!file.exists()) {
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("Файл успешно создан: " + filePath);
                } else {
                    System.out.println("Не удалось создать файл: " + filePath);
                    return;
                }
            } else {
                System.out.println("Файл уже существует и будет перезаписан: " + filePath);
            }

            // Ввод текста с консоли и запись в файл
            Scanner scanner = new Scanner(System.in);
            FileWriter writer = new FileWriter(file);

            System.out.println("Введите строки для записи в файл (пустая строка — завершить):");
            while (true) {
                String line = scanner.nextLine();
                if (line.isEmpty()) break;
                writer.write(line + "\n");
            }

            writer.close();
            System.out.println("Данные успешно записаны в файл 'input.txt'.");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}