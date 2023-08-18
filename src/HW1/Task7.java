//Декларативное программирование:
//Задача 7: Поиск подстроки.
// Напишите программу, которая находит все вхождения заданной подстроки в строке с использованием встроенных функций.

package HW1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task7 {
    public static void main(String[] args) {
        String textString = "Hello world from Java";
        String substring = "a";

        Pattern p = Pattern.compile(substring);
        Matcher m = p.matcher(textString);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

