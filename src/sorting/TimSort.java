package sorting;

import java.util.Arrays;
import java.util.List;

public class TimSort<T extends Comparable<T>> {

    private static int MIN_MERGE=4;
    void insertionSort(T[] arr, int start, int end){
        int len = end - start +1;
        for (int i = start+1; i < start+len; i++) {
            T temp = arr[i];
            int j =i-1;
            for( ;j >= start && arr[j].compareTo(temp) > 0; j--)
                arr[j+1]= arr[j];
            arr[j+1]= temp;
        }
    }

    void merge(T[] arr, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;

        T[] L1 = (T[]) new Comparable[n1];
        T[] L2 = (T[]) new Comparable[n2];

        System.arraycopy(arr,start,L1,0,n1);
        System.arraycopy(arr,mid+1,L2,0,n2);

        int i=0,j=0,k=start;
        while(i < n1 && j < n2){
            if(L1[i].compareTo(L2[j]) > 0 ){
                arr[k++] = L2[j++];
            }else {
                arr[k++] = L1[i++];
            }
        }

        while(i<n1)
            arr[k++] = L1[i++];

        while(j<n2)
            arr[k++] = L2[j++];
    }

    void sort(T[] arr){
        for (int i = 0; i < arr.length ; i+=MIN_MERGE) {
            insertionSort(arr,i,Math.min((i+MIN_MERGE-1), arr.length-1));
        }

        for (int i = MIN_MERGE; i < arr.length ; i*=2) {
            System.out.println("RUN SIZE "+i);
            for (int j = 0; j < arr.length; j+=2*i) {
                System.out.println("LEFT "+j);
                int mid = j+i -1;
                int right = Math.min((j+2*i-1), (arr.length)-1);
                if(mid < right)
                        merge(arr,j,mid,right);

            }
        }
    }

    public static void main(String[] args){
        TimSort<Integer> is = new TimSort<>();
        List<Integer> l = List.of(3,6,2,144,1,255,11,33,43,121,34,12,65,43,123,423,111,654);
        Integer[] arr = l.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        is.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
