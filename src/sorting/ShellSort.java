package sorting;

import java.util.Arrays;
import java.util.List;

public class ShellSort<T extends Comparable<T>> {

    void sort(T[] arr){
    int n = arr.length;
    int swaps=0;
        for (int gap = n/2 ; gap > 0 ; gap/=2) {

            for (int i = gap; i < n ; i++) {
                T temp = arr[i];
                int j;
                for ( j = i; j >= gap &&  arr[j-gap].compareTo(temp) > 0 ; j-=gap) {
                    arr[j]= arr[j-gap];
                    swaps++;
                }

                arr[j]= temp;
                swaps++;

            }
        }
        System.out.println("Total swaps "+swaps);
    }

    public static void main(String[] args){
        ShellSort<Integer> is = new ShellSort<>();
        List<Integer> l = List.of(3,6,2,144,1,255,11);
        Integer[] arr = l.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        is.sort(arr);
        System.out.println(Arrays.toString(arr));


    }


}
