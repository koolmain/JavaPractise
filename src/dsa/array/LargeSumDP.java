package dsa.array;

public class LargeSumDP {

    int algo(int[] arr){
        int[] dp = new int[arr.length];
        int ansMax=Integer.MIN_VALUE;
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            ansMax = Math.max(ansMax,dp[i]);
        }
        return  ansMax;
    }

    public static void main(String[] args) {
        int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        LargeSumDP dpSum = new LargeSumDP();
        System.out.println(dpSum.algo(arr));
    }
}
