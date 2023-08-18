//Декларативное программирование:
//Задача 3: Вычисление факториала числа.
// Напишите программу, которая находит факториал заданного числа N с использованием рекурсии или встроенных функций.

package HW1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = input.nextInt();
        System.out.print(n + "! = " + Factorial(n));
    }
    public static int Factorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * Factorial(f - 1);
        }
    }
}
