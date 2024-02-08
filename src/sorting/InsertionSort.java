package sorting;

import java.util.Arrays;
import java.util.List;

public class InsertionSort<T extends Comparable<T>> {

    public void sort(T[] arr, boolean isAscending){
        int swaps=0;
        for(int i=1; i< arr.length; i++){
            int j = i-1;
            T key = arr[i];

            while(j >= 0 && arr[j].compareTo(key) > 0){
                arr[j+1] = arr[j];
                swaps++;
                j--;
            }
            arr[j+1] = key;
            swaps++;
        }
        System.out.println("Total swaps "+ swaps);
    }


    public static void main(String[] args){
        InsertionSort<Integer> is = new InsertionSort<>();
        List<Integer> l = List.of(3,6,2,144,1,255,11);
        Integer[] arr = l.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        is.sort(arr, false);
        System.out.println(Arrays.toString(arr));

    }
}
