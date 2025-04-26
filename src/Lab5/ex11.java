package Lab5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex11 {
    public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : numbers) {
            if (num != null && num < threshold) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Используем Arrays.asList() вместо List.of(), так как он допускает null
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 12, 3, 8, 15, 7, null));
        int threshold = 8;

        List<Integer> filteredNumbers = filterNumbersLessThan(numbers, threshold);
        System.out.println("Числа меньше " + threshold + ": " + filteredNumbers);
        // Вывод: [5, 3, 7]
    }
}