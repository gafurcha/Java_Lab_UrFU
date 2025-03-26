package Lab3;

public class ex1_5 {
    public static void main(String[] args) {
        System.out.println("Результат: " + fact(5));
    }

    public static int fact(int n) {
        System.out.println("Вызов fact(" + n + ")");

        if (n == 0) {
            System.out.println("Вернул 0");
            return 0;
        } else if (n == 1) {
            System.out.println("Вернул 1");
            return 1;
        } else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("Вернул " + result + " для fact(" + n + ")");
            return result;
        }
    }
}
