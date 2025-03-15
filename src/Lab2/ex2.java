package Lab2;
public class ex2 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        int[][] array = new int[rows][columns];
        int num = 1;
        int top = 0, bottom = rows - 1;
        int left = 0, right = columns - 1;
        while (num <= rows * columns) {
            for (int i = left; i <= right && num <= rows * columns; i++) {
                array[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom && num <= rows * columns; i++) {
                array[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left && num <= rows * columns; i--) {
                array[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top && num <= rows * columns; i--) {
                array[i][left] = num++;
            }
            left++;
        }
        for (int[] row : array) {
            for (int elem : row) {
                System.out.printf("%3d ", elem);
            }
            System.out.println();
        }
    }
}
