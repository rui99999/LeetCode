package DP;

public class test413 {
    public static void main(String[] args) {
        System.out.println(Solution.numberOfArithmeticSlices(new int[]{1,2,3,8,9,10}));
    }
}
class Solution {
    public static int numberOfArithmeticSlices(int[] A) {
        int sum = 0;
        int[] dp = new int[A.length];
        dp[0] = dp[1] = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i - 1] + 1;
                sum += dp[i];
            }else {
                dp[i] = 0;

            }
        }
        return sum;
    }
}

