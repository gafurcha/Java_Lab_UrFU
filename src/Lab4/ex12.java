package Lab4;

public class ex12 {
    public static class Main { // Добавлен static для вложенного класса
        public static void m(String str, double chislo) {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }
        }

        public static void main(String[] args) {
            try {
                m(null, 0.000001); // Это вызовет IllegalArgumentException для null значения
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
