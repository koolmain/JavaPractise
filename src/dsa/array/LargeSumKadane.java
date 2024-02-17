package dsa.array;

public class LargeSumKadane {

    int algo(int[] arr){
        int maxSum=Integer.MIN_VALUE,maxSumCur=0;
        for (int i = 0; i < arr.length; i++) {
            maxSumCur+=arr[i];
            if(maxSum < maxSumCur)
                maxSum=maxSumCur;
            if(maxSumCur < 0)
                maxSumCur=0;
        }
        return  maxSum;
    }

    public static void main(String[] args) {
        int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        LargeSumKadane kadane = new LargeSumKadane();
        System.out.println(kadane.algo(arr));
    }

}
