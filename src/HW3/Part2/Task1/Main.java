//Фабричный метод:
//Реализуйте паттерн Фабричный метод на языке Python (сделала на Java) для создания геометрических фигур.
// Создайте класс ShapeFactory, имеющий метод create_shape(), который возвращает объекты различных геометрических фигур.

package HW3.Part2.Task1;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.create_shape(Shape.ShapeType.CIRCLE);
        circle.draw();
        Shape square = shapeFactory.create_shape(Shape.ShapeType.SQUARE);
        square.draw();
        Shape triangle = shapeFactory.create_shape(Shape.ShapeType.TRIANGLE);
        triangle.draw();
    }
}
