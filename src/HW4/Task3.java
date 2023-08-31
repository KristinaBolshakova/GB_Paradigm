//Функция-редуктор:
// Напишите функцию-редуктор (или функцию свертки), которая принимает начальное значение и список чисел,
// а затем возвращает произведение всех чисел в списке.
// Используйте эту функцию для вычисления произведения чисел в списке.

package HW4;

public class Task3 {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 2, 6, 4};
        int num = 1;
        System.out.println("Произведение чисел в списке = " + prod(num, array));
    }

    public static int prod(int n, int[] arr){
        for (int j : arr) {
            n *= j;
        }
        return n;
    }
}
