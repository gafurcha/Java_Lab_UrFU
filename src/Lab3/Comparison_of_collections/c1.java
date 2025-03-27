package Lab3.Comparison_of_collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class c1 {
    public static void main(String[] args) {
        final int ELEMENTS_COUNT = 7_000_000;

        // Прогрев JVM (опционально)
        warmUp();

        // 1. ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.addFirst(i);
        }
        System.out.println("ArrayDeque time: " + (System.nanoTime() - startTime) + " ns");

        // 2. ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(ELEMENTS_COUNT); // Оптимизация
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i); // Добавление в конец
        }
        Collections.reverse(arrayList); // Разворот
        System.out.println("ArrayList time: " + (System.nanoTime() - startTime) + " ns");

        // 3. LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.addFirst(i);
        }
        System.out.println("LinkedList time: " + (System.nanoTime() - startTime) + " ns");
    }

    private static void warmUp() {
        new ArrayList<>(100).add(0);
        new LinkedList<>().addFirst(0);
        new ArrayDeque<>().addFirst(0);
    }
}