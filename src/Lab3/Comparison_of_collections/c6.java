package Lab3.Comparison_of_collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class c6 {
    public static void main(String[] args) {
        final int ELEMENTS_COUNT = 100_000; // 100 тысяч элементов
        final int OPERATIONS_COUNT = 1_000; // Количество удалений для теста

        // 1. ArrayList
        List<Integer> arrayList = new ArrayList<>(ELEMENTS_COUNT);
        // Заполняем список
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            int middleIndex = arrayList.size() / 2;
            arrayList.remove(middleIndex); // Удаление из середины
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (удаление из середины): " +
                (endTime - startTime) / 1_000_000 + " ms для " +
                OPERATIONS_COUNT + " операций");

        // 2. LinkedList
        List<Integer> linkedList = new LinkedList<>();
        // Заполняем список
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(i);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            int middleIndex = linkedList.size() / 2;
            linkedList.remove(middleIndex); // Удаление из середины
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (удаление из середины): " +
                (endTime - startTime) / 1_000_000 + " ms для " +
                OPERATIONS_COUNT + " операций");
    }
}