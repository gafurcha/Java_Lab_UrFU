import java.util.LinkedList;

public class ex6_Linked {
    public static void main(String[] args) {
        int N = 100000; // Количество людей
        LinkedList<Integer> people = new LinkedList<>();

        // Заполняем список
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        long startTime = System.currentTimeMillis();

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size(); // Переход к следующему человеку
            people.remove(index); // Удаление каждого второго
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Оставшийся (LinkedList): " + people.get(0));
        System.out.println("Время выполнения: " + (endTime - startTime) + " мс");
    }
}