package timus;
import java.util.Scanner;
public class Task1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int area = A * B;
        int totalSulphide = 2 * N * area;

        System.out.println(totalSulphide);

        scanner.close();
    }
}
