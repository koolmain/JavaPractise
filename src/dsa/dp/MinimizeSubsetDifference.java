package dsa.dp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MinimizeSubsetDifference {


    boolean[] subsetProblem(int[] arr, int sum){
        int n = arr.length + 1;
        int s = sum + 1;

        boolean dp[][] = new boolean[n][s];

        for (int i = 0; i < s; i++) {
            dp[0][i] = false;
        }

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        System.out.println(Arrays.toString(dp[0]));


        for (int i = 1; i < n ; i++) {   //array index + 1
            for (int j = 1; j < s; j++) {  //sum
                if(arr[i-1] > j) {
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i - 1][j] || dp[i-1][j - arr[i - 1]];
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[n-1];
    }

    int minimumSubsetDifference(int[] arr, int sum ){

       boolean[] containment = subsetProblem(arr,sum);
       int min = Integer.MAX_VALUE;
        for (int i = 0; i <= sum/2 ; i++) {
            if(containment[i]) {
                System.out.println(i);
                min = Math.min(min, sum - 2 * i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
//        int[] arr = {1,6,11,5};
        int[] arr = {1,2,7};
        int sum =  Arrays.stream(arr).sum(); ;
        MinimizeSubsetDifference msd = new MinimizeSubsetDifference();
        System.out.println(msd.minimumSubsetDifference(arr,sum));
//        System.out.println(Arrays.toString(msd.subsetProblem(arr,sum)));

    }
}
