package Lab4;

public class ex6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");  // Не сработает (это другое исключение)
        } catch (RuntimeException e) {  // Сначала проверяем RuntimeException
            System.out.println("3");  // Сработает для NullPointerException
        } catch (Exception e) {  // Затем более общее Exception
            System.out.println("2");
        }
        System.out.println("4");
    }
}