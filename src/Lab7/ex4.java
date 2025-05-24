package Lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex4 {
    public static void main(String[] args) {
        String sourcePath = "input.txt";
        String targetPath = "output.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Файл успешно скопирован.");
        } catch (IOException e) {
            System.out.println("Ошибка копирования файла: " + e.getMessage());
        }
    }
}
