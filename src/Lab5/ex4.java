package Lab5;
import java.util.ArrayList;
import java.util.List;

public class ex4 {
    public static List<String> filterCapitalizedStrings(List<String> strings) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (!str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
                result.add(str);
            }
        }

        return result;
    }

    // Пример использования
    public static void main(String[] args) {
        List<String> input = List.of("Hello", "world", "Java", "programming", "OpenAI");
        List<String> filtered = filterCapitalizedStrings(input);

        System.out.println("Строки, начинающиеся с заглавной буквы: " + filtered);
        // Вывод: [Hello, Java, OpenAI]
    }
}