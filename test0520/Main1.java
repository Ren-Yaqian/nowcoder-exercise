package test0520;

public class Main1 {

    public int getFirstUnFormedNum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0;i < arr.length;i++) {
            min = Math.min(min, arr[i]);
            max += arr[i];
        }
        boolean[] dp = new boolean[max + 1];
        dp[0] = true;
        dp[arr[0]] = true;
        for (int i = 1;i < arr.length; i++) {
            for (int col = dp.length - 1; col-arr[i] >= 0; col--) {
                dp[col] = dp[col - arr[i]] ? true : dp[col];
            }
        }
        for (int num = min + 1; num <= max; num++) {
            if(! dp[num]) {
                return num;
            }
        }
        return max + 1;
    }
}
