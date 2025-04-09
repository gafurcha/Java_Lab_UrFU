package Lab4;

public class ex8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        try {
            m();
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }
}
