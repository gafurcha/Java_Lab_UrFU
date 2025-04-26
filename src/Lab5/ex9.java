package Lab5;
import java.util.ArrayList;
import java.util.List;

public class ex9 {
    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int threshold) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : numbers) {
            if (num > threshold) {
                result.add(num);
            }
        }

        return result;
    }

    // Пример использования
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 3, 8, 15, 7);
        int threshold = 7;

        List<Integer> filteredNumbers = filterNumbersGreaterThan(numbers, threshold);
        System.out.println("Числа больше " + threshold + ": " + filteredNumbers);
        // Вывод: [12, 8, 15]
    }
}