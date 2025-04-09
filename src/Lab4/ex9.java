package Lab4;

public class ex9 {
    public static int m() {
        try {
            System.out.println("0");
            return 55;    // Метод завершает выполнение тут
        } finally {
            System.out.println("1"); // Код в блоке finally выполнится всегда
        }
    }

    public static void main(String[] args) {
        System.out.println(m()); // Вывод результата вызова метода m()
    }
}
