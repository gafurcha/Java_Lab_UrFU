package Lab5;
import java.util.ArrayList;
import java.util.List;

public class ex7 {
    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        List<Integer> result = new ArrayList<>();

        // Проверка на ноль (деление на ноль невозможно)
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }

        for (Integer num : numbers) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }

        return result;
    }

    // Пример использования
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30);
        int divisor = 5;

        List<Integer> divisibleNumbers = filterDivisibleNumbers(numbers, divisor);
        System.out.println("Числа, делящиеся на " + divisor + ": " + divisibleNumbers);
        // Вывод: [10, 15, 20, 25, 30]
    }
}