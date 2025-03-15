package Lab2.geometry;

public class Rectangle {
    private double length; // Поле для длины
    private double width;  // Поле для ширины

    // Конструктор
    public Rectangle(double length, double width) {
        this.length = length; // Установка длины
        this.width = width;   // Установка ширины
    }

    // Метод для установки длины
    public void setLength(double length) {
        this.length = length;
    }

    // Метод для установки ширины
    public void setWidth(double width) {
        this.width = width;
    }

    // Метод для получения длины
    public double getLength() {
        return length;
    }

    // Метод для получения ширины
    public double getWidth() {
        return width;
    }

    // Метод для вычисления площади
    public double area() {
        return length * width;
    }

    // Метод для вычисления периметра
    public double perimeter() {
        return 2 * (length + width);
    }
}
