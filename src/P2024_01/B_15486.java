package P2024_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] T = new int[N + 2];
        int[] P = new int[N + 2];
        int[] dp = new int[N + 2];
        //퇴사일 + 1
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
            System.out.println(Arrays.toString(T));
            System.out.println(Arrays.toString(P));
        }
//        System.out.println(T);
//        System.out.println(P);
        int maxProfit = 0;

        for (int i = 1; i <= N + 1; i++) {
            dp[i] = Math.max(dp[i], maxProfit);
            if (i + T[i] <= N + 1) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
            maxProfit = Math.max(maxProfit, dp[i]);
        }

        System.out.println(maxProfit);
    }
}
