package dsa.dp;

import java.util.Arrays;

public class BoundedKnapsack {

    int knpasack(int[] wt, int[] val, int W){

        int n = wt.length + 1;
        int dpW = W + 1;
        int[][] dp = new int[n][W+1];

        for (int i = 0; i < n; i++) {
            dp[i][0]=0;
        }

        for (int i = 0; i < dpW; i++) {
            dp[0][i] = 0;
        }
        System.out.println(Arrays.toString(dp[0]));

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < dpW; j++) {

                if(wt[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else{
                   dp[i][j] = Math.max(dp[i-1][j], val[i-1]+ dp[i-1][j-wt[i-1]]);
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[n-1][dpW-1];
    }
    public static void main(String[] args) {
//        int[] wt = {1,3,4,5};
//        int[] val = {1,4,5,7};
//        int W = 7;
        int[] wt = {1,2,3};
        int[] val = {10,15,40};
        int W =6;
        BoundedKnapsack bKnapScak = new BoundedKnapsack();
        System.out.println(bKnapScak.knpasack(wt,val,7));


    }
}
