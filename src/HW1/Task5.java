//Императивное программирование:
//Задача 5: Поиск простых чисел.
// Напишите программу, которая находит все простые числа в заданном диапазоне от 1 до N.

package HW1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
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
