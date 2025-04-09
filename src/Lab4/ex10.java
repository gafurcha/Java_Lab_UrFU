package Lab4;

public class ex10 {
    public static int m() {
        try {
            System.out.println("0");
            return 15; // Этот return будет проигнорирован из-за return в finally
        } finally {
            System.out.println("1");
            // Удаляем return 20; так как это вводит в заблуждение
        }
    }

    public static void main(String[] args) {
        System.out.println(m()); // Вывод результата вызова метода m()
    }
}
