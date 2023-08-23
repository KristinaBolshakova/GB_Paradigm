package HW3.Part2.Task3;

import java.util.Arrays;

public class BubbleSort implements SortStrategy{

    @Override
    public void sort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-i-1; j++) {
                if (num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println("Сортировка пузырьком: " + Arrays.toString(num));
    }
}
