import java.util.Scanner;

public class Flags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println(2);
            return;
        }

        long[] f = new long[n + 1];
        f[1] = 2;
        f[2] = 2;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        System.out.println(f[n]);
    }
}
