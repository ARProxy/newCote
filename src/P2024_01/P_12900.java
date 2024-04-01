package P2024_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_12900 {
    public static void main(String[] args) {
        int target = 5;
        int[] nums = {1, 2};
        System.out.println(findCombinationsCount(target, nums));
    }
    private static int findCombinationsCount(int target, int[] nums) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for(int i = 1; i <= target; i++) {
            for(int num : nums) {
                if(i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[target];
    }
}

//    List<List<Integer>> result = new ArrayList<>();
//    findCombinations(4, new ArrayList<>(), 0, result);
//        for (List<Integer> combination : result) {
//        System.out.println(combination);
//        }
//        System.out.println(sumValue);
//        }
//private static void findCombinations(int target, List<Integer> current, int sum, List<List<Integer>> result) {
//
//        if (sum > target) {
//        return;
//        }
//        if (sum == target) {
//        result.add(new ArrayList<>(current));
//        sumValue++;
//        return;
//        }
//
//        // 가능한 숫자 (1과 2)를 각각 시도
//        for (int i = 1; i <= 2; i++) {
//        current.add(i);
//        findCombinations(target, current, sum + i, result); // 재귀 호출
//        current.remove(current.size() - 1); // 마지막 요소 제거 후 다음 숫자 탐색
//        }
//
//        }