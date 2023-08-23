package HW3.Part2.Task1;

public class ShapeFactory {
    /**
     * Метод создания фигуры
     *
     * @param shapeType - тип фигуры
     * @return - возвращает тип фигуры
     */
    public Shape create_shape(Shape.ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case TRIANGLE -> new Triangle();
            case SQUARE -> new Square();
            default -> null;
        };
    }
}
