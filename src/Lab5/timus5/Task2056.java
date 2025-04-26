package Lab5.timus5;
import java.util.Scanner;
public class Task2056 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] grades = new int[n];

            // Считываем оценки
            for (int i = 0; i < n; i++) {
                grades[i] = scanner.nextInt();
            }

            // Проверяем условия для стипендии
            String result = checkScholarship(grades);
            System.out.println(result);
        }

        public static String checkScholarship(int[] grades) {
            boolean hasThrees = false;
            boolean allFives = true;
            double sum = 0;

            // Анализируем оценки
            for (int grade : grades) {
                if (grade == 3) {
                    hasThrees = true;
                }
                if (grade != 5) {
                    allFives = false;
                }
                sum += grade;
            }

            double average = sum / grades.length;

            // Проверяем условия в порядке приоритета
            if (hasThrees) {
                return "None";
            } else if (allFives) {
                return "Named";
            } else if (average >= 4.5) {
                return "High";
            } else {
                return "Common";
            }
        }
    }
