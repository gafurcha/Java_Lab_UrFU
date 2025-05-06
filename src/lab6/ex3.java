package lab6;

public class ex3 {
    public static void main(String[] args) {
        // Поток для четных чисел
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Четный поток: " + i);
                try {
                    Thread.sleep(100); // Небольшая задержка
                } catch (InterruptedException e) {
                    System.out.println("Четный поток прерван");
                }
            }
        });

        // Поток для нечетных чисел
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Нечетный поток: " + i);
                try {
                    Thread.sleep(100); // Небольшая задержка
                } catch (InterruptedException e) {
                    System.out.println("Нечетный поток прерван");
                }
            }
        });

        // Запускаем потоки
        evenThread.start();
        oddThread.start();

        // Ждем завершения потоков
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
    }
}