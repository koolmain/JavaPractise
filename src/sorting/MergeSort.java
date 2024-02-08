package sorting;

import java.util.Arrays;
import java.util.List;

public class MergeSort<T extends  Comparable<T>> {

    void merge(T[] arr, int low, int mid, int high){

        int n1 = mid -low + 1 ;
        int n2 = high - mid ;

        T[] LeftA = (T[]) new Comparable[n1];
        T[] RightA = (T[]) new Comparable[n2];

        for(int i=0; i < n1; i++){
            LeftA[i] = arr[low+i];
        }

        for(int j=0; j < n2; j++){
            RightA[j] = arr[mid+j];
        }

        int i = 0,j = 0;
        int k =low;

        while(i < n1 && j < n2){
            if(LeftA[i].compareTo(RightA[j]) <= 0){
                arr[k]= LeftA[i];
                i++;
            }else {
                arr[k] = RightA[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = LeftA[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = RightA[j];
            j++;
             k++;
        }
    }

   void sort(T[] arr, int low, int high){
        if(low < high){
            int mid = low + (high - low)/2;
            sort(arr,low,mid);
            sort(arr,mid+1, high);
            merge(arr,low,mid,high);
        }
    }

    public static void main(String[] args){
        MergeSort<Integer> is = new MergeSort<>();
        List<Integer> l = List.of(3,6,2,144,1,255,11);
        Integer[] arr = l.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        is.sort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
