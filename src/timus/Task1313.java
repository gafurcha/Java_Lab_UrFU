package timus;
import java.util.Scanner;
public class Task1313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] pixels = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pixels[i][j] = scanner.nextInt();
            }
        }
        for (int sum = 0; sum < 2 * n - 1; sum++) {
            for (int i = 0; i < n; i++) {
                int j = sum - i;
                if (j >= 0 && j < n) {
                    System.out.print(pixels[i][j] + " ");
                }
            }
        }
    }
}
