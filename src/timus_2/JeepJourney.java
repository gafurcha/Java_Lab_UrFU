import java.util.Scanner;

public class JeepJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        double fuelNeeded = 0;
        double currDistance = N;
        double loadFactor = Math.ceil((double) N / M);

        while (currDistance > M) {
            fuelNeeded += M * loadFactor;
            currDistance -= M;
            loadFactor = Math.ceil((double) currDistance / M);
        }

        fuelNeeded += (loadFactor * currDistance);

        // Выводим минимальное количество топлива, округленное вверх до целого
        System.out.println((int) Math.ceil(fuelNeeded));
    }
}
