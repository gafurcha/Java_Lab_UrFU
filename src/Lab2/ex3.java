package Lab2;
import java.util.Scanner;
public class ex3 {
    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'А' : 'а';
                int shiftedPos = (character - base + shift) % 32;
                char shiftedChar = (char) (base + (shiftedPos < 0 ? 32 + shiftedPos : shiftedPos));
                result.append(shiftedChar);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String text = scanner.nextLine();
        System.out.println("Введите ключ");
        int key;
        try {
            key = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ключ. Пожалуйста, введите число.");
            return;
        }
        String encryptedText = caesarCipher(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("y")) {
                String decryptedText = caesarCipher(encryptedText, -key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            } else if (response.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ.");
            }
        }
        scanner.close();
    }
}
