//Императивное программирование:
//Задача 6: Упорядочивание списка.
// Напишите программу, которая сортирует список чисел в порядке возрастания с использованием пузырьковой сортировки или другого метода сортировки.

package HW1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[] {2, 5, 9, 1, 6};
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        System.out.println("Отсортированный массив: " + Arrays.toString(SortArray(array)));
    }

    public static int[] SortArray(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 ; j++) {
                    if (arr[j] > arr[j+1]){
                       int temp = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

