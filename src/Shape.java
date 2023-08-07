// интерфейс для геометрических фигур
public interface Shape {

    /**
     * Вычисляет площадь фигурыы
     * @return  площадь фигуры */
    abstract double getArea();
    /**
     * Выисляет периметр фигуры
     * @return  периметр фигуры */
    abstract double getPerimeter();
}