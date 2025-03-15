package Lab2.geometry;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
    }
}


