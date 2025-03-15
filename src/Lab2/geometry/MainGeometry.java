package Lab2.geometry;

public class MainGeometry {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Круг: Площадь = " + circle.area() + ", Периметр = " + circle.perimeter());

        Shape square = new Square(4);
        System.out.println("Квадрат: Площадь = " + square.area() + ", Периметр = " + square.perimeter());

        Shape triangle = new Triangle(3, 4, 3, 4, 5);
        System.out.println("Треугольник: Площадь = " + triangle.area() + ", Периметр = " + triangle.perimeter());
    }
}
