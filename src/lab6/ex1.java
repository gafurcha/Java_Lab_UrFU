package lab6;

import java.time.LocalTime;

public class ex1 {
    public static void main(String[] args) throws InterruptedException {
        // Создаем первый поток
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000); // Пауза 1 секунда
                } catch (InterruptedException e) {
                    System.out.println("Поток прерван");
                }
            }
        });

        // Создаем второй поток
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000); // Пауза 1 секунда
                } catch (InterruptedException e) {
                    System.out.println("Поток прерван");
                }
            }
        });

        // Устанавливаем имена потоков (необязательно)
        thread1.setName("Поток 1");
        thread2.setName("Поток 2");

        // Запускаем потоки
        thread1.start();
        thread2.start();

        // Ждем завершения потоков
        thread1.join();
        thread2.join();

        System.out.println("Программа завершена");
    }
}