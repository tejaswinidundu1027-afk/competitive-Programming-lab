import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }

        int k = n / 2;
        boolean[][] dp = new boolean[k + 1][total + 1];

        dp[0][0] = true;

        for (int w : a) {
            for (int j = k; j >= 1; j--) {
                for (int s = total; s >= w; s--) {
                    if (dp[j - 1][s - w]) {
                        dp[j][s] = true;
                    }
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int s = 0; s <= total; s++) {
            if (dp[k][s]) {
                ans = Math.min(ans, Math.abs(total - 2 * s));
            }
        }

        if (n % 2 == 1) {
            for (int s = 0; s <= total; s++) {
                if (dp[k][s]) {
                    ans = Math.min(ans, Math.abs(total - 2 * s));
                }
            }
        }

        System.out.println(ans);
    }
}




1
