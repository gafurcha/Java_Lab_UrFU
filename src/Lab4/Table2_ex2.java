package Lab4;
import java.util.Scanner;
public class Table2_ex2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Введите количество строк матрицы:");
                int rows = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите количество столбцов матрицы:");
                int cols = Integer.parseInt(scanner.nextLine());

                int[][] matrix = new int[rows][cols];
                System.out.println("Введите элементы матрицы построчно:");

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] = Integer.parseInt(scanner.nextLine());
                    }
                }

                System.out.println("Введите номер столбца (нумерация с 0):");
                int columnIndex = Integer.parseInt(scanner.nextLine());

                if (columnIndex < 0 || columnIndex >= cols) {
                    throw new ArrayIndexOutOfBoundsException("Столбца с таким номером не существует.");
                }

                System.out.println("Столбец " + columnIndex + ":");
                for (int i = 0; i < rows; i++) {
                    System.out.println(matrix[i][columnIndex]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: было введено нечисловое значение.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Неизвестная ошибка: " + e.getMessage());
            }
        }
    }
