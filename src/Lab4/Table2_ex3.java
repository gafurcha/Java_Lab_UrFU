package Lab4;
import java.util.Scanner;
public class Table2_ex3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Введите размер массива:");
                int size = Integer.parseInt(scanner.nextLine());

                byte[] array = new byte[size];
                System.out.println("Введите элементы массива (диапазон типа byte):");

                for (int i = 0; i < size; i++) {
                    int num = Integer.parseInt(scanner.nextLine());
                    if (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
                        throw new ArithmeticException("Значение элемента массива выходит за границы диапазона типа byte.");
                    }
                    array[i] = (byte) num;
                }

                int sum = 0;

                for (byte value : array) {
                    sum += value;
                }

                System.out.println("Сумма элементов: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: было введено нечисловое значение.");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Неизвестная ошибка: " + e.getMessage());
            }
        }
}
