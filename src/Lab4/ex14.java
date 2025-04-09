package Lab4;

public class ex14 {
    public static class Main { // Добавлено static
        public static void m(int x) throws ArithmeticException {
            // int h = 10 / x; // Убрано, если переменная h не используется
            int result = 10 / x; // Можно оставить для понимания
        }

        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("размер массива= " + l);
                m(l);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: Деление на ноль");
            }
        }
    }
}
