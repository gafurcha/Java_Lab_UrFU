package Lab7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ex2_6 {
    public static void main(String[] args) {
        String inputFileName = "src/lr8/examples/input.txt";
        String outputFileName = "src/lr8/examples/output.txt";

        // Проверка наличия файла и ввод данных с консоли при необходимости
        File inputFile = new File(inputFileName);
        File dir = inputFile.getParentFile();
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Папки созданы: " + dir.getPath());
            } else {
                System.out.println("Не удалось создать папки: " + dir.getPath());
                return;
            }
        }

        if (!inputFile.exists()) {
            try {
                if (inputFile.createNewFile()) {
                    System.out.println("Создан пустой файл: " + inputFileName);
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введите строки для записи в input.txt (пустая строка завершает ввод):");
                    StringBuilder inputBuilder = new StringBuilder();
                    String line;
                    while (true) {
                        line = scanner.nextLine();
                        if (line.isEmpty()) break;
                        inputBuilder.append(line).append(System.lineSeparator());
                    }
                    Files.write(Paths.get(inputFileName), inputBuilder.toString().getBytes(StandardCharsets.UTF_8));
                    System.out.println("Данные записаны в файл: " + inputFileName);
                }
            } catch (IOException e) {
                System.out.println("Ошибка при создании input.txt: " + e.getMessage());
                return;
            }
        }

        // Основная логика копирования с преобразованием
        try (BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(new FileInputStream(inputFileName), StandardCharsets.UTF_8));
             PrintWriter printWriter =
                     new PrintWriter(outputFileName, StandardCharsets.UTF_8)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }

            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
