import java.util.Scanner;
public class Task1005 {
    public static int minDifference(int[] weights, int n) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        boolean[] dp = new boolean[sum / 2 + 1];
        dp[0] = true;
        for (int weight : weights) {
            for (int j = dp.length - 1; j >= weight; j--) {
                dp[j] |= dp[j - weight];
            }
        }
        for (int j = dp.length - 1; j >= 0; j--) {
            if (dp[j]) {
                return sum - 2 * j;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        System.out.println(minDifference(weights, n));
    }
}

