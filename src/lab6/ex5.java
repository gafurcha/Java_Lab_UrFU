package lab6;

import java.util.concurrent.*;

public class ex5 {
    public static int findMax(int[] array) throws InterruptedException, ExecutionException {
        // Получаем количество доступных ядер процессора
        int threadsCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(threadsCount);

        // Размер части массива для каждого потока
        int chunkSize = (array.length + threadsCount - 1) / threadsCount;

        // Список для хранения результатов
        Future<Integer>[] results = new Future[threadsCount];

        // Раздаем задачи потокам
        for (int i = 0; i < threadsCount; i++) {
            final int start = i * chunkSize;
            final int end = Math.min(start + chunkSize, array.length);

            results[i] = executor.submit(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
                return max;
            });
        }

        // Находим общий максимум
        int globalMax = Integer.MIN_VALUE;
        for (Future<Integer> result : results) {
            int localMax = result.get();
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }

        executor.shutdown();
        return globalMax;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] array = {3, 7, 2, 8, 12, 4, 6, 9, 1, 5, 10, 11};
        int max = findMax(array);
        System.out.println("Максимальный элемент: " + max);
    }
}