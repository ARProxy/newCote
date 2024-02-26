package P2024_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Earth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<List<Integer>> earth = new ArrayList<>() {{
            for (int i = 0; i < n; i++) {
                add(new ArrayList<>() {{
                    for (int j = 0; j < m; j++) {
                        add(sc.nextInt());
                    }
                }});
            }
        }};
        System.out.println(findMinPathSum(earth));
        sc.close();
    }
    private static int findMinPathSum(List<List<Integer>> list) {
        if (list == null || list.isEmpty()) return 0;

        int rows = list.size();
        int cols = list.get(0).size();

        int[][] dp = new int[rows][cols];
        for (int j = 0; j < cols; j++) {
            dp[0][j] = list.get(0).get(j);
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dp[i][j] = list.get(i).get(j) + dp[i - 1][j];
            }
        }

        int minSum = dp[rows - 1][0];
        for (int j = 1; j < cols; j++) {
            if (dp[rows - 1][j] < minSum) {
                minSum = dp[rows - 1][j];
            }
        }

        return minSum;
    }
}
