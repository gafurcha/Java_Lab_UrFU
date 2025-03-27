package Lab3.Comparison_of_collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class c2 {
    public static void main(String[] args) {
        final int ELEMENTS_COUNT = 7_000_000; // 7 миллионов элементов

        // 1. ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(ELEMENTS_COUNT); // Оптимизация: предвыделение памяти
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i); // Добавление в конец
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList (в конец): " + (endTime - startTime) + " ns");

        // 2. LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.addLast(i); // Явное добавление в конец
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList (в конец): " + (endTime - startTime) + " ns");

        // 3. ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.addLast(i); // Добавление в конец
        }
        endTime = System.nanoTime();
        System.out.println("ArrayDeque (в конец): " + (endTime - startTime) + " ns");
    }
}