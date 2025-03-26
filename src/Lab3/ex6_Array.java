import java.util.ArrayList;

public class ex6_Array {
    public static void main(String[] args) {
        int N = 100000; // Количество людей
        ArrayList<Integer> people = new ArrayList<>();

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

        System.out.println("Оставшийся (ArrayList): " + people.get(0));
        System.out.println("Время выполнения: " + (endTime - startTime) + " мс");
    }
}