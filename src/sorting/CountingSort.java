package sorting;

import java.util.Arrays;

public class CountingSort {

    int[] sort(int[] arr, boolean isAscending){
        int M =arr[0];
        int N = arr.length;
        int[] output = new int[N];


        for(int i =0; i < N; i++)
            if(arr[i]  > M)
                M = arr[i];

        int[] countArr = new int[M+1];

        for(int i=0; i < N; i++){
            countArr[arr[i]]++;
        }

        for(int j=1; j <= M; j++)
            countArr[j] += countArr[j-1];

        for(int i =N-1; i >=0; i--){
            output[countArr[arr[i]] -1 ] = arr[i];
            countArr[arr[i]]--;

        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,0,2,3,0,3};
        CountingSort cs = new CountingSort();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(cs.sort(arr,false)));
    }
}
