package sorting;

import java.util.Arrays;

public class RadixSort {


    int[] coutingSort(int[] arr, int len, int exp){
        int[] output = new int[len];
        int[] countingArr = new int[10];
        for (int i = 0; i < len; i++) {
            countingArr[(arr[i]/exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            countingArr[i] += countingArr[i-1];
        }

        for (int i = 0; i < len; i++) {
            output[countingArr[(arr[i]/exp) % 10] -1 ] = arr[i];
        }

        return output;

    }

    void sort(int[] arr, boolean isAscending ){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        for (int exp = 1; max/exp >=0 ; exp*=10) {
            coutingSort(arr,arr.length,exp);
        }

    }

    public static void main(String[] args) {
        int[] arr = {170,45,75,90,802,24,2,66};
        CountingSort cs = new CountingSort();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(cs.sort(arr,false)));
    }
}
