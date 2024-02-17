package dsa.dp;

import java.util.Arrays;

public class UnBoundedKnapsack {

    int unboundedKnapsack(int[] wt, int[] val, int W){
        int n = wt.length +1;
        int dpW = W +1;
        int[][] dp = new int[n][dpW];

        for (int i = 0; i <n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dpW; i++) {
            dp[0][i] = 0;
        }
        System.out.println(Arrays.toString(dp[0]));

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < dpW; j++) {
                if(wt[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j] , val[i-1] + dp[i][j-wt[i-1]]);
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }

        return  dp[n-1][dpW-1];
    }

    public static void main(String[] args) {
//        int[] wt = {1,50};
//        int[] val = {1,30};
//        int W = 100;
        int[] wt = {1,3,4,5};
        int[] val = {10,40,50,70};
        int W = 8;
        UnBoundedKnapsack uks = new UnBoundedKnapsack();
        System.out.println(uks.unboundedKnapsack(wt,val,W));
    }

}
