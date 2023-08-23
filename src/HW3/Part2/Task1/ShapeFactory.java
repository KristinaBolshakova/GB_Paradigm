package HW3.Part2.Task1;

public class ShapeFactory {
    public Shape create_shape(Shape.ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case TRIANGLE -> new Triangle();
            case SQUARE -> new Square();
            default -> null;
        };
    }
}
