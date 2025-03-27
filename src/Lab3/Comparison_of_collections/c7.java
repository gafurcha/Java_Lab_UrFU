package Lab3.Comparison_of_collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class c7 {
    private static final int ELEMENTS_COUNT = 7_000_000;
    private static final int OPERATIONS_COUNT = 10_000; // Уменьшено для LinkedList

    public static void main(String[] args) {
        // 1. ArrayList (оптимален для случайного доступа)
        List<Integer> arrayList = new ArrayList<>(ELEMENTS_COUNT);
        fillList(arrayList);

        long startTime = System.nanoTime();
        testRandomAccess(arrayList);
        long arrayListTime = System.nanoTime() - startTime;
        System.out.printf("ArrayList (7M элементов): %.2f ms\n", arrayListTime / 1_000_000.0);

        // 2. LinkedList (крайне неэффективен)
        List<Integer> linkedList = new LinkedList<>();
        fillList(linkedList);

        // Уменьшаем количество операций для LinkedList
        startTime = System.nanoTime();
        testRandomAccessLimited(linkedList, OPERATIONS_COUNT);
        long linkedListTime = (System.nanoTime() - startTime) * (100_000 / OPERATIONS_COUNT);
        System.out.printf("LinkedList (экстраполяция для 100K операций): %.2f ms\n",
                linkedListTime / 1_000_000.0);

        // ArrayDeque исключен - не поддерживает доступ по индексу
    }

    private static void fillList(List<Integer> list) {
        System.out.printf("Заполнение %s...\n", list.getClass().getSimpleName());
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(i);
        }
    }

    private static void testRandomAccess(List<Integer> list) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 100_000; i++) {
            int index = random.nextInt(ELEMENTS_COUNT);
            int value = list.get(index);
        }
    }

    private static void testRandomAccessLimited(List<Integer> list, int operations) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < operations; i++) {
            int index = random.nextInt(ELEMENTS_COUNT);
            int value = list.get(index);
        }
    }
}