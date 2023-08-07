// Класс для треугольника
class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Конструктор класса Triangle
     * @param side1 Длина перевой стороны треугольника
     * @param side2 Длина второй стороны треугольника
     * @param side3 Длина третьей стороны треугльника */
    public Triangle(double side1, double side2, double side3) {
        if (side1<=0 || side2<=0 || side3<=0) throw new IllegalArgumentException("Длина сторон треугольника должны быть положительными");
        if (side1>(side2+side3) || side2>(side1+side3) || side3>(side1+side2)) throw new ArithmeticException("Треугольник с заданными параметрами не может существовать");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
