//Декларативное программирование:
//Задача 4: Поиск уникальных элементов в списке.
// Напишите программу, которая создает новый список, содержащий только уникальные элементы из исходного списка.

package HW1;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Integer[] array = {2, 5, 9, 1, 6, 5, 3, 2};
        System.out.println("Первый вариант: " + NewArrayList(array));

        List<Integer> list = Arrays.stream(array).distinct().toList();
        System.out.println("Второй вариант: " + list);
    }

    public static HashSet<Integer> NewArrayList(Integer[] arr){
        return new HashSet<>(Arrays.asList(arr));
    }
}
