/**
 * Задание:
 * Разбиение массива на подмассивы:

 * Описание: Имеется массив чисел.
 * Необходимо разбить его на подмассивы так, чтобы сумма чисел в каждом подмассиве была меньше или равна заданному значению X.
 * Почему это процедурное программирование:
 * Можно создать процедуру, которая будет принимать массив и значение X,
 * а затем последовательно формировать подмассивы, следуя определенной логике.
 * Это позволяет выделить процесс создания каждого подмассива в отдельную подпрограмму,
 * делая основной код более чистым и понятным.

 * Задание: Напишите функцию, которая принимает массив чисел и значение X.
 * Функция должна возвращать массив подмассивов так, чтобы сумма чисел в каждом подмассиве была меньше или равна X.

 * Входные данные:
 * Массив чисел длиной N.
 * Число X.
 * Выходные данные:
 * Массив подмассивов.
 */


package HW2;


import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arrayLength = sc.nextInt();
        System.out.print("Введите диапазон чисел в массиве.\nот: ");
        int numStart = sc.nextInt();
        System.out.print("до: ");
        int numEnd = sc.nextInt();
        int[] arrayList = randMas(arrayLength, numStart, numEnd);
        System.out.print("Введите число X для расчета суммы подмассивов: ");
        int num = sc.nextInt();

        List<List<Integer>> subArrays = subArray(arrayList, num);
        System.out.println(subArrays);

//        for (int i = 0; i < subArrays.size(); i++) {
//            System.out.println(subArrays.get(i));
//     }
    }

    /**
     *
     * @param n - размер массива
     * @param a - диапазон массива от
     * @param b - диапазон массива до
     * @return - возвращает сформированный массива
     */

    public static int[] randMas(int n, int a, int b) {
        int[] array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(a, b);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    /**
     *
     * @param arr - массив чисел
     * @param n - число для рассчета суммы, для разделения на подмассивы
     * @return возвращает массив подмассивов
     */
    public static List<List<Integer>> subArray(int[] arr, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curSubArray = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= n) {
                sum += arr[i];
                curSubArray.add(arr[i]);
            } else {
                result.add(curSubArray);
                curSubArray = new ArrayList<>();
                sum = 0;
            }
        }
        if (!curSubArray.isEmpty()) {
            result.add(curSubArray);
        }
        return result;
    }
}