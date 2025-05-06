package lab6;

import java.util.concurrent.*;

public class ex6 {
    public static long sum(int[] array) throws InterruptedException, ExecutionException {
        // Получаем количество ядер процессора
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);

        // Вычисляем размер части массива для каждого потока
        int chunkSize = (array.length + cores - 1) / cores;

        // Массив для хранения результатов каждого потока
        Future<Long>[] partialSums = new Future[cores];

        // Раздаем задачи потокам
        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = Math.min(start + chunkSize, array.length);

            partialSums[i] = executor.submit(() -> {
                long localSum = 0;
                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }
                return localSum;
            });
        }

        // Суммируем результаты всех потоков
        long totalSum = 0;
        for (Future<Long> partial : partialSums) {
            totalSum += partial.get();
        }

        executor.shutdown();
        return totalSum;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Тестирование функции
        int[] array = new int[1_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        long startTime = System.nanoTime();
        long sum = sum(array);
        long duration = System.nanoTime() - startTime;

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Время выполнения: " + duration / 1_000_000 + " мс");
    }
}
