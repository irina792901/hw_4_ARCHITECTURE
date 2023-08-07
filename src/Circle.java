// Класс для круга
class Circle implements Shape {
    private double radius;

    /**
     * Конструктор класса Circle
     * @param radius Радиус круга */
    public Circle(double radius) {
        if (radius<=0) throw new IllegalArgumentException("Радиус круга должен быть положительным");
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

