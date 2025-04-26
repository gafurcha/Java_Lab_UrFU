package Lab5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex3 {
    public static int[] findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonElements = new ArrayList<>();

        // Проходим по каждому элементу первого массива
        for (int num1 : array1) {
            // Проверяем, содержится ли текущий элемент во втором массиве
            for (int num2 : array2) {
                if (num1 == num2) {
                    // Проверяем, чтобы не добавлять дубликаты
                    if (!commonElements.contains(num1)) {
                        commonElements.add(num1);
                    }
                    break; // Переходим к следующему элементу первого массива
                }
            }
        }

        // Преобразуем список в массив
        int[] result = new int[commonElements.size()];
        for (int i = 0; i < commonElements.size(); i++) {
            result[i] = commonElements.get(i);
        }

        return result;
    }

    // Пример использования
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] commonElements = findCommonElements(array1, array2);

        System.out.print("Общие элементы: ");
        for (int num : commonElements) {
            System.out.print(num + " ");
        }
        // Вывод: Общие элементы: 4 5 
    }
}