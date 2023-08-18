//Императивное программирование:
//Задача 2: Поиск наименьшего числа в списке.
// Напишите программу, которая находит наименьшее число в заданном списке с помощью цикла.

package HW1;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] {2, 5, 9, 1, 6};
        System.out.println("Наименьшее число в списке: " + MinNum(array));
    }

    public static int MinNum (int[] arr){
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;
    }
}
