//Декоратор:
//Создайте класс Coffee с методом cost(), возвращающим стоимость кофе.
// Реализуйте декораторы Sugar и Milk, которые добавляют сахар и молоко к кофе, соответственно.
// Создайте объект кофе и последовательно примените к нему декораторы, затем выведите общую стоимость.

package HW3.Part2.Task4;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BlackCoffee();

        coffee = new Sugar(coffee);
        coffee = new Milk(coffee);

        System.out.println("Стоимость кофе с добавками: " + coffee.cost());
    }
}
