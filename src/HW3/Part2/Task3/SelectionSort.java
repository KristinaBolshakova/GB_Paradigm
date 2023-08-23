package HW3.Part2.Task3;

import java.util.Arrays;

public class SelectionSort implements SortStrategy{
    @Override
    public void sort(int[] num) {
        for(int i = 0; i < num.length-1; i++){
            int min = i;
            for(int j = i+1; j < num.length; j++){
                if (num[j] < num[min]){
                    min = j;
                }
            }
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        System.out.println("Сортировка выбором: " + Arrays.toString(num));
    }
}
