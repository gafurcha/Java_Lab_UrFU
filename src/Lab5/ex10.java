package Lab5;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ex10 {

    // Проверяет, состоит ли строка только из букв
    private static boolean containsOnlyLetters(String str) {
        return str != null && str.matches("^[a-zA-Z]+$");
    }

    // Способ 1: Классический подход с циклом
    public static List<String> filterLettersOnlyClassic(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (containsOnlyLetters(str)) {
                result.add(str);
            }
        }
        return result;
    }

    // Способ 2: Использование Stream API
    public static List<String> filterLettersOnlyStream(List<String> strings) {
        return strings.stream()
                .filter(ex10::containsOnlyLetters)  // Используем ex10 вместо LetterOnlyStrings
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> testData = List.of("Hello", "Java8", "Programming", "2023", "Strings", "!", "With Spaces");

        System.out.println("Классический метод:");
        System.out.println(filterLettersOnlyClassic(testData));
        // Вывод: [Hello, Programming, Strings]

        System.out.println("\nStream API метод:");
        System.out.println(filterLettersOnlyStream(testData));
        // Вывод: [Hello, Programming, Strings]
    }
}