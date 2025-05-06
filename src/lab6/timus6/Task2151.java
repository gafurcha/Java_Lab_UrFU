import java.util.*;

public class Task2151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Читаем строку и делим на кости
        String[] tiles = scanner.nextLine().split(" ");
        System.out.println(checkHand(tiles));
    }

    // Основная функция проверки состояния руки
    static String checkHand(String[] tiles) {
        Map<String, Integer> count = new HashMap<>();
        for (String tile : tiles) {
            count.put(tile, count.getOrDefault(tile, 0) + 1);
        }
        // Проверка на Tsume (победная рука)
        if (canWin(count, 0)) return "Tsumo";
        // Проверка на Tenpai (почти победная)
        for (String tile : count.keySet()) {
            if (count.get(tile) < 4) {
                count.put(tile, count.get(tile) + 1);
                if (canWin(count, 0)) {
                    count.put(tile, count.get(tile) - 1);
                    return "Tenpai";
                }
                count.put(tile, count.get(tile) - 1);
            }
        }
        return "Noten";
    }

    // Проверка, можно ли собрать руку, начиная с пар и трёк
    static boolean canWin(Map<String, Integer> count, int pairs) {
        // Собрано 4 тройки и одна пара
        int total = 0;
        for (int c : count.values()) total += c;
        if (total == 0) return pairs == 1;
        for (String tile : count.keySet()) {
            int cnt = count.get(tile);
            if (cnt == 0) continue;
            // Ищем пару
            if (cnt >= 2 && pairs == 0) {
                count.put(tile, cnt - 2);
                if (canWin(count, 1)) {
                    count.put(tile, cnt);
                    return true;
                }
                count.put(tile, cnt);
            }
            // Ищем одинаковую тройку
            if (cnt >= 3) {
                count.put(tile, cnt - 3);
                if (canWin(count, pairs)) {
                    count.put(tile, cnt);
                    return true;
                }
                count.put(tile, cnt);
            }
            // Ищем последовательную тройку
            if (tile.length() == 2) {
                char suit = tile.charAt(1);
                int num = tile.charAt(0) - '0';
                String tile2 = (num + 1) + "" + suit;
                String tile3 = (num + 2) + "" + suit;
                if (count.getOrDefault(tile2, 0) > 0 && count.getOrDefault(tile3, 0) > 0) {
                    count.put(tile, count.get(tile) - 1);
                    count.put(tile2, count.get(tile2) - 1);
                    count.put(tile3, count.get(tile3) - 1);
                    if (canWin(count, pairs)) {
                        count.put(tile, count.get(tile) + 1);
                        count.put(tile2, count.get(tile2) + 1);
                        count.put(tile3, count.get(tile3) + 1);
                        return true;
                    }
                    count.put(tile, count.get(tile) + 1);
                    count.put(tile2, count.get(tile2) + 1);
                    count.put(tile3, count.get(tile3) + 1);
                }
            }
        }
        return false;
    }
}
