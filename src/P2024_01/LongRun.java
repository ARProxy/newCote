package P2024_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongRun {
    public static void main(String[] args) {
        int n = 4;
        Solution002 so = new Solution002();
        System.out.println(so.solution(n));
    }
//        int n = 4;
//        List<List<Integer>> result = new ArrayList<>();
//        findCombinations(0, new ArrayList<>(), result, n);
//
//        System.out.println(result);
//    }
//
//    public static void findCombinations(int currentSum, List<Integer> currentPath, List<List<Integer>> result, int n) {
//        if (currentSum == n) {
//            result.add(new ArrayList<>(currentPath));
//            return;
//        }
//
//        if (currentSum > n) {
//            return;
//        }
//
//        // 1 더하기
//        currentPath.add(1);
//        findCombinations(currentSum + 1, currentPath, result, n);
//        currentPath.remove(currentPath.size() - 1);
//
//        // 2 더하기
//        currentPath.add(2);
//        findCombinations(currentSum + 2, currentPath, result, n);
//        currentPath.remove(currentPath.size() - 1);
//    }
}
// 1,2 를 사용해서 일단 1로만 이루어진 배열, 2로만 이루어진 배열, 그리고 1,2가 들어간 배열을 구한다.

class Solution002 {
    public long solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}

