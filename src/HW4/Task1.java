//Рекурсивная сумма: Напишите рекурсивную функцию, которая вычисляет сумму всех чисел от 1 до n.
// Например, для n = 5 результат должен быть 1 + 2 + 3 + 4 + 5 = 15.
//
//Факториал: Напишите рекурсивную функцию для вычисления факториала числа n.
// Факториал числа n обозначается как n! и равен произведению всех положительных целых чисел от 1 до n.

package HW4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int num = input.nextInt();
        System.out.println("Сумма чисел = " + sum(num));
        System.out.println("n!= " + factorial(num));
    }

    public static int sum(int n){
        if(n == 1) {
            return 1;
        } else{
            return n + sum(n - 1);
        }
    }

    public static int factorial(int n){
        int result = 1;
        if (n == 1 || n == 0){
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }

}
