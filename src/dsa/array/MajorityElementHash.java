package dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementHash {

    int[] majorityElement(int[] arr, int k ){
        int[] ndkFreq = new int[k-1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        int requiredFreq = arr.length / k;
        int freIndex=0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > requiredFreq)
                ndkFreq[freIndex++] = entry.getKey() ;
        }

        return ndkFreq;

    }

    public static void main(String[] args) {
        int[] arr = { 3,1,2,2,2,1,4,3,3};
        MajorityElementHash mjElem = new MajorityElementHash();
        System.out.println(Arrays.toString(mjElem.majorityElement(arr,4)));
    }
}
