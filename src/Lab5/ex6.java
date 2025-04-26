package Lab5;
import java.util.ArrayList;
import java.util.List;

public class ex6 {
    public static List<String> filterBySubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str.contains(substring)) {
                result.add(str);
            }
        }

        return result;
    }

    // Пример использования
    public static void main(String[] args) {
        List<String> input = List.of("apple", "banana", "grape", "pineapple", "apricot");
        String substring = "ap";

        List<String> filtered = filterBySubstring(input, substring);
        System.out.println("Строки, содержащие '" + substring + "': " + filtered);
        // Вывод: [apple, grape, pineapple, apricot]
    }
}