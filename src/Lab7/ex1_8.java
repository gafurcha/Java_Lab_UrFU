package Lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ex1_8 {
    public static void main(String[] args) {
        // Указываем путь к директории и файлу
        String dirPath = "C:\\Users\\gafur\\IdeaProjects\\MyFirstApp\\src\\lr8\\example7";
        String filePath = dirPath + "\\input.txt";

        try {
            // Создаем папки, если их нет
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

            // Создаем файл input.txt, если его нет
            File file = new File(filePath);
            if (!file.exists()) {
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("Файл успешно создан: " + filePath);

                    // Добавляем пример содержимого
                    FileWriter writer = new FileWriter(file);
                    writer.write("Это первая строка\n");
                    writer.write("Это вторая строка\n");
                    writer.write("Третья строка\n");
                    writer.close();
                    System.out.println("Файл 'input.txt' заполнен текстом.");
                } else {
                    System.out.println("Не удалось создать файл: " + filePath);
                }
            } else {
                System.out.println("Файл уже существует: " + filePath);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
