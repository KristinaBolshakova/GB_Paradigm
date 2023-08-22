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

//[0, 0, 1, 0, 0]
//[0, 0, 0, 0, 1]
//[0, 1, 1, 0, 0]
//[0, 0, 0, 1, 0]
//[0, 1, 0, 0, 0]

package HW2;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrCoor = inOut(input);
        int[][] array = randMas(arrCoor);
        printMas(array);
        ArrayList<int[]> mazePath = moveInMaze(array, arrCoor);

        if(mazePath != null){
            for (int i = 0; i < mazePath.size(); i++) {
                System.out.println(Arrays.toString(mazePath.get(i)));
            }
        }
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
                    mas[i][j] = 0;
                } else if ((i == ox) && (j == oy)) {
                    mas[i][j] = 0;
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

    public static ArrayList<int[]> moveInMaze(int[][] maze, ArrayList<Integer> arr){
        int m = arr.get(0);
        int n = arr.get(1);
        int ix = arr.get(2);
        int iy = arr.get(3);
        int ox = arr.get(4);
        int oy = arr.get(5);

//        int m = maze.length;
//        int n = maze[0].length;

        // Проверяем, что начальная и конечная точки находятся в пределах лабиринта
        if (ix < 0 || ix >= m || iy < 0 || iy >= n || ox < 0 || ox >= m || oy < 0 || oy >= n) {
            System.out.println("Начальная или конечная точка находятся за пределами лабиринта.");
            return null;
        }

        // Проверяем, что начальная и конечная точки не являются стенами
        if (maze[ix][iy] == 1 || maze[ox][oy] == 1) {
            System.out.println("Начальная или конечная точка находятся на стене.");
            return null;
        }

        // Массив для хранения пути
        ArrayList<int[]> path = new ArrayList<>();

        // Массив, используемый для отслеживания уже посещенных точек
        boolean[][] visited = new boolean[m][n];

        // Создаем очередь для поиска в ширину
        Queue<int[]> queue = new LinkedList<>();

        // Добавляем начальную точку в очередь и отмечаем ее как посещенную
        queue.offer(new int[]{ix, iy});
        visited[ix][iy] = true;

        // Массив для хранения направлений движения: вверх, вниз, влево, вправо
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Пока очередь не пуста, продолжаем поиск
        while (!queue.isEmpty()) {
            // Извлекаем текущую точку из очереди
            int[] curr = queue.poll();
            int currX = curr[0];
            int currY = curr[1];

            // Если текущая точка соответствует конечной точке, достигнут путь
            if (currX == ox && currY == oy) {
                // Добавляем конечную точку в путь
                path.add(new int[]{currX, currY});

                // Возвращаем путь
                return path;
            }

            // Проходим по всем возможным направлениям движения
            for (int[] direction : directions) {
                int newX = currX + direction[0];
                int newY = currY + direction[1];

                // Проверяем, что новые координаты находятся в пределах лабиринта и являются проходом
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && maze[newX][newY] == 0 && !visited[newX][newY]) {
                    // Добавляем новую точку в путь и в очередь
                    path.add(new int[]{newX, newY});
                    queue.offer(new int[]{newX, newY});

                    // Отмечаем новую точку как посещенную
                    visited[newX][newY] = true;
                }
            }
        }

        // Если достижение конечной точки невозможно, возвращаем сообщение об ошибке
        System.out.println("Путь от начальной до конечной точки невозможен.");
        return null;
    }
}
