package task5;

public class Task5 {

    int countVariants(int stearsCount) {
        if (stearsCount <= 0) {
            return 0;
        } else if (stearsCount == 1) {
            return 1;
        } else if (stearsCount == 2) {
            return 2;
        }

        int[] dp = new int[stearsCount + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= stearsCount; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[stearsCount];
    }


}
