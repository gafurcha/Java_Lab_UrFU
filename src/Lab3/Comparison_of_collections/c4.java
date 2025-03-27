package Lab3.Comparison_of_collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Deque;

public class c4 {
    public static void main(String[] args) {
        final int ELEMENTS_COUNT = 100_000; // Уменьшено для приемлемого времени выполнения

        // 1. ArrayList
        List<Integer> arrayList = new ArrayList<>(ELEMENTS_COUNT);
        // Заполняем список
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        while (!arrayList.isEmpty()) {
            arrayList.remove(0); // Удаление из начала
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (удаление из начала): " + (endTime - startTime) / 1_000_000 + " ms");

        // 2. LinkedList
        List<Integer> linkedList = new LinkedList<>();
        // Заполняем список
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(i);
        }

        startTime = System.nanoTime();
        while (!linkedList.isEmpty()) {
            linkedList.remove(0); // Удаление из начала
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (удаление из начала): " + (endTime - startTime) / 1_000_000 + " ms");

        // 3. ArrayDeque
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        // Заполняем дек
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.addLast(i);
        }

        startTime = System.nanoTime();
        while (!arrayDeque.isEmpty()) {
            arrayDeque.removeFirst(); // Удаление из начала
        }
        endTime = System.nanoTime();
        System.out.println("ArrayDeque (удаление из начала): " + (endTime - startTime) / 1_000_000 + " ms");
    }
}