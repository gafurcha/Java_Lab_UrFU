package Lab3.Comparison_of_collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Deque;

public class c5 {
    public static void main(String[] args) {
        final int ELEMENTS_COUNT = 100_000; // Используем 100 тыс. элементов

        // 1. ArrayList
        List<Integer> arrayList = new ArrayList<>(ELEMENTS_COUNT);
        // Заполнение списка
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        while (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1); // Удаление последнего элемента
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (удаление с конца): " + (endTime - startTime) / 1_000_000 + " ms");

        // 2. LinkedList
        List<Integer> linkedList = new LinkedList<>();
        // Заполнение списка
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(i);
        }

        startTime = System.nanoTime();
        while (!linkedList.isEmpty()) {
            ((LinkedList<Integer>) linkedList).removeLast(); // Удаление последнего элемента
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (удаление с конца): " + (endTime - startTime) / 1_000_000 + " ms");

        // 3. ArrayDeque
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        // Заполнение дека
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.addLast(i);
        }

        startTime = System.nanoTime();
        while (!arrayDeque.isEmpty()) {
            arrayDeque.removeLast(); // Удаление последнего элемента
        }
        endTime = System.nanoTime();
        System.out.println("ArrayDeque (удаление с конца): " + (endTime - startTime) / 1_000_000 + " ms");
    }
}