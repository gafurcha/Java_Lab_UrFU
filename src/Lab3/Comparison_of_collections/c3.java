package Lab3.Comparison_of_collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class c3 {
    public static void main(String[] args) {
        final int ELEMENTS_COUNT = 100_000; // Уменьшено для приемлемого времени выполнения
        final int MIDDLE_INDEX = ELEMENTS_COUNT / 2;

        // Прогрев JVM (опционально)
        warmUp();

        // 1. ArrayList
        List<Integer> arrayList = new ArrayList<>(ELEMENTS_COUNT);
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            if (i == MIDDLE_INDEX) {
                arrayList.add(MIDDLE_INDEX, i); // Вставка в середину
            } else {
                arrayList.add(i); // Заполнение списка
            }
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (в середину): " + (endTime - startTime) / 1_000_000 + " ms");

        // 2. LinkedList
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            if (i == MIDDLE_INDEX) {
                linkedList.add(MIDDLE_INDEX, i); // Вставка в середину
            } else {
                linkedList.add(i); // Заполнение списка
            }
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (в середину): " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void warmUp() {
        List<Integer> list = new ArrayList<>();
        list.add(0, 0); // Прогрев для ArrayList
        list = new LinkedList<>();
        list.add(0, 0); // Прогрев для LinkedList
    }
}