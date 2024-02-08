package sorting;

import java.util.Arrays;
import java.util.List;

public class QuickSort<T extends  Comparable<T>> {

    void swap(T[] arr, int first, int second){
        T swap = arr[first];
        arr[first] = arr[second];
        arr[second] = swap;
    }

    int partition(T[] arr, int low, int high){

        T pivot = arr[high];
        int smallerIndex = low-1;
        for(int j=low; j<high; j++)
        {
            if(arr[j].compareTo(pivot) < 0){
                smallerIndex++;
                swap(arr, smallerIndex,j);
            }
        }

        swap(arr, smallerIndex +1 , high );
        return smallerIndex +1;
    }

    void quickSort(T[] arr, int low, int high ){
        if(low < high){
            int pivot = partition( arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static void main(String[] args){
        QuickSort<Integer> is = new QuickSort<>();
        List<Integer> l = List.of(3,6,2,144,1,255,11);
        Integer[] arr = l.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        is.quickSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
