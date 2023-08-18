//Императивное программирование:
//Задача 1: Подсчет суммы четных чисел от 1 до N.
// Напишите программу, используя цикл, которая находит сумму всех четных чисел в диапазоне от 1 до заданного числа N.

package HW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = input.nextInt();
        System.out.println("Сумма четных чисел от 1 до N = " + Sum(n));
    }

    public static int Sum(int num){
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
