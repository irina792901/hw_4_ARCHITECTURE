// Класс для прямоугольника
class Rectangle implements Shape {
    private double length;
    private double width;

    /**
     * Конструктор класса Rectangle
     * @param length длина прямоугольника
     * @param width  ширина прямоугольника
     * */

    public Rectangle(double length, double width) {
        if (length<=0 || width<=0) throw new IllegalArgumentException("Длина и ширина прямоугольника должны быть положительны");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
