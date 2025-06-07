package Lab8;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
        import org.apache.poi.xssf.usermodel.*;

public class ex7 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\bsr\\IdeaProjects\\Java\\example_excel.xlsx";

        try (FileInputStream inputStream = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet sheet = workbook.getSheetAt(0);


            if (sheet == null) {
                System.err.println("Лист не найден в файле!");
                return;
            }

            System.out.println("Чтение данных из листа: " + sheet.getSheetName());

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }
    }
}