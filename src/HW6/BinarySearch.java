// Бинарный поиск

package HW6;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 3, 2, 6, 4};
        int numberToFind = 3;
        Arrays.sort(array);
        System.out.printf("Индекс = %d%n", binarySearch(array, numberToFind, 0, array.length - 1));
    }

    private static int binarySearch(int[] arr, int numToFind, int l, int r) {
        if (l == r) {
            return (arr[l] == numToFind) ? l : -1;
        }

        int n = l + (r - l) / 2;

        if (numToFind > arr[n]) {
            return binarySearch(arr, numToFind, n + 1, r);
        } else if (arr[n] > numToFind) {
            return binarySearch(arr, numToFind, l, n - 1);
        }
        return n;
    }
}
