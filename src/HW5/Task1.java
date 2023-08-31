//Задача 1: Напишите программу, которая находит все простые числа в заданном диапазоне.
//
//Простые числа - это числа больше 1, которые не имеют делителей, кроме 1 и самих себя.
// Задача состоит в том, чтобы написать программу, которая будет находить и выводить все простые числа в заданном диапазоне.
//
//Пример решения:
//
//Программа принимает на вход начальное и конечное числа диапазона.
//Для каждого числа в диапазоне проверяется, является ли оно простым.
//Если число простое, оно добавляется в список простых чисел.
//В конце программа выводит список найденных простых чисел.

package HW5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = input.nextInt();
        System.out.println("Простые числа от 1 до N = " + PrimeNum(n));
    }

    public static ArrayList<Integer> PrimeNum(int num){
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                newArrayList.add(i);
            }
        }
        return newArrayList;
    }

}
