//Декларативное программирование:
//Задача 8: Вычисление суммы цифр числа.
// Напишите программу, которая вычисляет сумму всех цифр заданного числа, используя математические операции и деление нацело.

package HW1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();

        System.out.println("Сумма первый способ: " + SumNum(num));

        System.out.println("Сумма второй способ: " + Sum(num));

        System.out.println("Сумма третий способ: " + SumDigits(num));
    }

    public static int SumNum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int Sum(int numb){
        int s = String.valueOf(numb)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        return s;
    }

    public static int SumDigits(int i) {
        return i == 0 ? 0 : i % 10 + SumDigits(i / 10);
    }
}
