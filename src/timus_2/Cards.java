import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] count = new int[n];

        boolean possible = true;
        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();
            count[num]++;
            if (count[num] > 2) {
                possible = false;
            }
        }

        System.out.println(possible ? "YES" : "NO");
    }
}
