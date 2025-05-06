package lab6;

public class ex4 {
    public static void main(String[] args) {
        // Создаем и запускаем 10 потоков
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;  // Финальная переменная для номера потока

            new Thread(() -> {
                System.out.println("Поток " + threadNumber + " запущен");

                // Имитация работы потока
                try {
                    Thread.sleep(500);  // Небольшая задержка
                } catch (InterruptedException e) {
                    System.out.println("Поток " + threadNumber + " прерван");
                }

                System.out.println("Поток " + threadNumber + " завершен");
            }).start();
        }
    }
}