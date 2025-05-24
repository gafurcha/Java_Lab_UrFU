package Lab7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ex2_5 {
    public static void main(String[] args) {
        String inputFileName = "src/lr8/examples/input.txt";
        String outputFileName = "src/lr8/examples/output.txt";
        File inputFile = new File(inputFileName);

        // Создаём все необходимые папки, если их нет
        File dir = new File(inputFile.getParent());
        if (!dir.exists()) {
            boolean created = dir.mkdirs();
            if (created) {
                System.out.println("Папки созданы: " + dir.getPath());
            } else {
                System.out.println("Не удалось создать папки: " + dir.getPath());
                return;
            }
        }

        // Проверяем наличие файла input.txt
        if (!inputFile.exists()) {
            try {
                if (inputFile.createNewFile()) {
                    System.out.println("Создан пустой файл: " + inputFileName);

                    // Ввод данных с консоли
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введите строку для записи в файл input.txt (введите пустую строку для завершения):");
                    StringBuilder userInput = new StringBuilder();
                    String line;
                    while (true) {
                        line = scanner.nextLine();
                        if (line.isEmpty()) break;
                        userInput.append(line).append(System.lineSeparator());
                    }

                    // Запись данных пользователя в файл
                    Files.write(Paths.get(inputFileName),
                            userInput.toString().getBytes(StandardCharsets.UTF_8));
                    System.out.println("В файл добавлен ваш текст.");
                } else {
                    System.out.println("Не удалось создать input.txt.");
                    return;
                }
            } catch (IOException e) {
                System.out.println("Ошибка при создании input.txt: " + e.getMessage());
                return;
            }
        }

        // Основная логика копирования с преобразованием
        try (
                BufferedReader bufferedReader =
                        new BufferedReader(new InputStreamReader(
                                new FileInputStream(inputFileName), StandardCharsets.UTF_8));
                BufferedWriter bufferedWriter =
                        new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(outputFileName), StandardCharsets.UTF_8))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
