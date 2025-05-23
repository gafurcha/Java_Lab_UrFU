package Lab7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex1_8_2 {
    public static void main(String[] args) {
        // Используй относительный путь (файл должен быть в корне проекта, где src)
        String inputPath = "input.txt";
        String outputPath = "output.txt";

        try {
            // Если файла нет - он будет создан и заполнен содержимым "Тестовое содержимое"
            File inputFile = new File(inputPath);
            if (!inputFile.exists()) {
                try (FileWriter fw = new FileWriter(inputFile)) {
                    fw.write("Тестовое содержимое файла input.txt\nМожно изменить этот текст.");
                }
                System.out.println("Файл input.txt был создан автоматически. Проверь и запусти программу ещё раз.");
                return; // Предлагаем повторный запуск, чтобы скопировать содержимое только что созданного файла
            }

            try (FileReader reader = new FileReader(inputFile);
                 FileWriter writer = new FileWriter(outputPath)) {
                int c;
                while ((c = reader.read()) != -1) {
                    writer.write(c);
                }
                System.out.println("Файл скопирован успешно! Проверь файл output.txt.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
