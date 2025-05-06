package lab6;

public class ex2 {
    public static void main(String[] args) {
        // Создаем и запускаем поток
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000); // Задержка в 1 секунду
                } catch (InterruptedException e) {
                    System.out.println("Поток был прерван");
                    return; // Завершаем выполнение потока при прерывании
                }
            }
        }).start();
    }
}
