public class Question {
    public static void main(String[] args) {
        int[] intArray = {3, 4, 5};
        float[] floatArray = {7.2f, 1.8f, 9.3f};
        char[] charArray = new char[2];

        for (int number : intArray) {
            System.out.println(number);
        }

        for (float number : floatArray) {
            System.out.println(number);
        }

        for (char character : charArray) {
            System.out.println(character);
        }
    }
}
