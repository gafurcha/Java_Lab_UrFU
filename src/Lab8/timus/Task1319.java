package Lab8.timus;

import java.util.Scanner;

public class Task1319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] grid = new int[N][N];

        int currentNumber = 1;

        for (int d = 0; d < N; d++) {
            int row = 0;
            int col = N - 1 - d;
            while (col < N && row < N) {
                grid[row][col] = currentNumber++;
                row++;
                col++;
            }
        }

        for (int d = 1; d < N; d++) {
            int col = 0;
            int row = d;
            while (row < N && col < N) {
                grid[row][col] = currentNumber++;
                row++;
                col++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}