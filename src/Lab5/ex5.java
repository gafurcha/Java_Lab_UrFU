package Lab5;
import java.util.ArrayList;
import java.util.List;

public class ex5 {
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        List<Integer> squaredNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            squaredNumbers.add(num * num);
        }

        return squaredNumbers;
    }

    // Пример использования
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        List<Integer> result = squareNumbers(input);

        System.out.println("Квадраты чисел: " + result);
        // Вывод: [1, 4, 9, 16, 25]
    }
}