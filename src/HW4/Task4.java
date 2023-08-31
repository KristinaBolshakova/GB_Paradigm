//Функции-редуцеры для списков:
// Напишите функцию-редуктор, которая принимает список строк и возвращает строку,
// состоящую из объединенных элементов списка через запятую.
// Например, для списка ["apple", "banana", "cherry"] результат должен быть "apple, banana, cherry".

package HW4;

import java.util.List;
import java.util.StringJoiner;

public class Task4 {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry");
        String result = reduceToString(strings);
        System.out.println(result);
    }

    public static String reduceToString(List<String> lStrings){
        StringJoiner joiner = new StringJoiner(", ");
        for (String lString : lStrings) {
            joiner.add(lString);
        }
        return joiner.toString();
    }
}
