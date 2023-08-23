//Стратегия:
//Реализуйте паттерн Стратегия на языке Python (сделала на Java) для сортировки списка чисел.
// Создайте класс SortStrategy, имеющий метод sort(numbers),
// и несколько конкретных стратегий для различных методов сортировки (например, пузырьковая сортировка, сортировка выбором).

package HW3.Part2.Task3;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {2, 5, 9, 1, 6};

        SortStrategy selectionSort = new SelectionSort();
        selectionSort.sort(array);
        SortStrategy bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

    }
}
