package timus;
import java.util.Scanner;
public class Task1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int harriesShots = scanner.nextInt();
        int larrysShots = scanner.nextInt();
        int totalCans = harriesShots + larrysShots - 1;
        int harriesUnshotCans = totalCans - harriesShots;
        int larrysUnshotCans = totalCans - larrysShots;
        System.out.println(harriesUnshotCans + " " + larrysUnshotCans);
    }
}
