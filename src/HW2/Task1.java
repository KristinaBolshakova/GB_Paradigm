/*
 * Задание:
 *
 * **Структурное программирование:
 * Трассировка пути в лабиринте:**
 *
 * Задание: Создайте функцию, которая принимает двумерный массив (лабиринт) и начальную и конечную точки.
 * Функция должна возвращать путь от начальной до конечной точки или сообщение, что путь невозможен.
 * Входные данные:
 * Двумерный массив размера MxN, где '0' - это проход, а '1' - это стена.
 * Координаты начальной и конечной точки.
 * Выходные данные:
 * Массив координат пути или сообщение об ошибке.
 */

package HW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrCoor = inOut(input);
        int[][] array = randMas(arrCoor);
        printMas(array);
    }

    /**
     * Метод, отвечающий за формирование массива на основание вводных данных
     * @param arr - массив координат входных данных
     * @return - возвращает сформированный массив
     */
    public static int[][] randMas(ArrayList<Integer> arr) {
        int m = arr.get(0);
        int n = arr.get(1);
        int ix = arr.get(2);
        int iy = arr.get(3);
        int ox = arr.get(4);
        int oy = arr.get(5);

        int[][] mas = new int[m][n];
        Random rand = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == ix) && (j == iy)) {
                    mas[i][j] = 3;
                } else if ((i == ox) && (j == oy)) {
                    mas[i][j] = 3;
                } else {
                    mas[i][j] = rand.nextInt(2);
                }
            }
        }
        return mas;
    }


    /**
     * Метод, отвечающий за печать массива
     *
     * @param mas - сформированный массив
     */
    public static void printMas(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
    }

    /**
     * Метод, отвечающий за проверку ввода размерности массива и координат входной и выходной точки
     * @param scanner - сканер ввода данных
     * @return - возвращает сформированный массив координат
     */
    public static ArrayList<Integer> inOut(Scanner scanner) {
        ArrayList<Integer> arrList = new ArrayList<>();

        // ввод размерности массива
        System.out.println("Введите размер массива ");
        System.out.print("Введите M: ");
        int m = scanner.nextInt();
        arrList.add(m);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        arrList.add(n);

        // проверка координат входа в лабиринт
        while (true) {
            System.out.println("Введите точку входа: ");
            System.out.print("Введите x: ");
            int inX = scanner.nextInt();

            // x = 0 или максимальному значению x(m-1)
            if (inX == 0 || inX == m-1) {
                System.out.print("Введите y: ");
                int inY = scanner.nextInt();
                if(inY >= n){
                    System.out.println("Вы вышли за границы массива, вход не может быть за границами лабиринта.");
                } else {
                    arrList.add(inX);
                    arrList.add(inY);
                    break;
                }
            }
            // x больше или равно m
            else if (inX >= m) {
                System.out.println("Вы вышли за границы массива, вход не может быть за границами лабиринта.");
            }
            // иные значения x, входящие в границы массива
            else {
                System.out.printf("Введите y = 0, либо %d\nВведите y: ", n-1);
                int inY = scanner.nextInt();
                if(inY == 0 || inY == n-1){
                    arrList.add(inX);
                    arrList.add(inY);
                    break;
                } else {
                    System.out.println("Вы вышли за границы массива, вход не может быть за границами лабиринта.");
                }
            }
        }

        // проверка координат выхода из лабиринта
        while (true) {
            System.out.println("Введите точку выхода: ");
            System.out.print("Введите x: ");
            int outX = scanner.nextInt();

            // x = 0 или максимальному значению x(m-1)
            if (outX == 0 || outX == m-1) {
                System.out.print("Введите y: ");
                int outY = scanner.nextInt();
                if(outY >= n){
                    System.out.println("Вы вышли за границы массива, вход не может быть за границами лабиринта.");
                } else {
                    arrList.add(outX);
                    arrList.add(outY);
                    break;
                }
            }
            // x больше или равно m
            else if (outX >= m) {
                System.out.println("Вы вышли за границы массива, вход не может быть за границами лабиринта.");
            }
            // иные значения x, входящие в границы массива
            else {
                System.out.printf("Введите y = 0, либо %d\nВведите y: ", n-1);
                int outY = scanner.nextInt();
                if(outY == 0 || outY == n-1){
                    arrList.add(outX);
                    arrList.add(outY);
                    break;
                } else {
                    System.out.println("Вы вышли за границы массива, вход не может быть за границами лабиринта.");
                }
            }
        }
        return arrList;
    }

    public static void moveInMaze(int[][] masArray){

    }
}
