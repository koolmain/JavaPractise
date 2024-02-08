package sorting;

import java.util.Arrays;
import java.util.List;

public class SelectionSort<T extends Comparable<T>> {

    private void swap(T[] list, int first, int second){
        T swap = list[first];
        list[first] = list[second];
        list[second] = swap;
    }

    void sort(T[] arr, boolean isAscending){
        for(int i=0 ; i< arr.length; i++){
            int min_idx=i;
            for(int j=i+1; j < arr.length; j++){
                if(arr[min_idx].compareTo(arr[j]) > 0) {
                    min_idx= j;
                }
            }
            swap(arr,i,min_idx);
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void main(String[] args){
        SelectionSort<Integer> ss = new SelectionSort<>();
        List<Integer> l = List.of(3,6,2,144,1,255,11);
        Integer[] arr = l.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr));
        ss.sort(arr,false);
        System.out.println(Arrays.toString(arr));
    }
}
