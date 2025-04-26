package Lab5;
import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static int[] filterEvenNumbers(int[] numbers) {
        // Используем список для динамического хранения четных чисел
        List<Integer> evenNumbersList = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbersList.add(number);
            }
        }

        // Преобразуем список в массив для возврата
        int[] evenNumbersArray = new int[evenNumbersList.size()];
        for (int i = 0; i < evenNumbersList.size(); i++) {
            evenNumbersArray[i] = evenNumbersList.get(i);
        }

        return evenNumbersArray;
    }

    // Пример использования
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = filterEvenNumbers(input);

        System.out.print("Четные числа: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}