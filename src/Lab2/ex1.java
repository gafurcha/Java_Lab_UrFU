package Lab2;
import java.util.Random;
import java.util.ArrayList;
public class ex1 {
    public static void main(String[] args) {
        // Задаем размер массива
        int size = 10; // Можно изменить размер массива по желанию
        int[] array = new int[size];
        Random random = new Random();
        // Заполняем массив случайными числами от 0 до 99
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        // Отображаем массив в консоли
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Находим минимальное значение и его индексы
        int minValue = array[0];
        ArrayList<Integer> minIndices = new ArrayList<>();
        // Ищем минимальное значение
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndices.clear();
                minIndices.add(i);
            } else if (array[i] == minValue) {
                minIndices.add(i);
            }
        }
        // Выводим результат
        System.out.println("Минимальное значение: " + minValue);
        System.out.print("Индексы элементов с минимальным значением: ");
        for (int index : minIndices) {
            System.out.print(index + " ");
        }
    }
}
