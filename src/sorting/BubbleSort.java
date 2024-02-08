package sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort<T extends  Comparable<T>> {

    private void swap(T[] numbers, int first, int second){
        T swap = numbers[second];
        numbers[second] = numbers[first];
        numbers[first] = swap;
    }
    void sort(T[] numbers, boolean isAscending){

        for(int j=0 ; j < numbers.length -1 ; j++ ){
            boolean swapped =false;
            for(int i = 1; i< numbers.length - j; i++){
                if(isAscending) {
                    if (numbers[i - 1].compareTo(numbers[i]) > 0) {
                        swap(numbers, i - 1, i);
                        swapped = true;
                    }
                } else {
                    if (numbers[i - 1].compareTo(numbers[i]) < 0) {
                        swap(numbers, i - 1, i);
                        swapped = true;
                    }
                }
            }

            if(swapped == false)
                break;
        }
    }

    public static void main(String[] args){
//        BubbleSort<Integer> bs = new BubbleSort<>();
//        List<Integer> l = List.of(3,6,2,144,1,255,11);
        BubbleSort<String> bs = new BubbleSort<>();
        List<String> l = List.of("Ram", "Shyam","Sita","Gita", "Anari", "Aam");
//        Integer[] arr = l.toArray(new Integer[0]);
        String[] arr = l.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        bs.sort(arr,false);
        System.out.println(Arrays.toString(arr));
    }
}
