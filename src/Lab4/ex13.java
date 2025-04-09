package Lab4;

public class ex13 {
    public static class Main { // Сделали класс static
        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("размер массива= " + l);

                if (l > 0) {
                    int h = 10 / l;
                }
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс не существует");
            }
        }
    }
}
