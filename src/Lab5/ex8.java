package Lab5;
import java.util.ArrayList;
import java.util.List;

public class ex8 {
    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str.length() > minLength) {
                result.add(str);
            }
        }

        return result;
    }

    // Пример использования
    public static void main(String[] args) {
        List<String> input = List.of("Java", "Python", "C++", "JavaScript", "Go");
        int minLength = 3;

        List<String> filtered = filterStringsByLength(input, minLength);
        System.out.println("Строки длиннее " + minLength + ": " + filtered);
        // Вывод: [Java, Python, C++, JavaScript]
    }
}