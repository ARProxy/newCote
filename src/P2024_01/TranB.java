package P2024_01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TranB {
    public static void main(String[] args) {
//        int[] grade = {2, 2, 1};
        int[] grade = {3,2,1,2};
        int sum = Arrays.stream(grade).sum();
        System.out.println(sum);
        int[] sortedGrade = Arrays.copyOf(grade, grade.length);
        Arrays.sort(sortedGrade);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for(int i = sortedGrade.length - 1; i >= 0; i--) {
            if(!rankMap.containsKey(sortedGrade[i])) {
                rankMap.put(sortedGrade[i], rank);
            }
            rank++;
        }

        int[] ranks = new int[grade.length];
        for(int i=0; i<grade.length; i++) {
            ranks[i] = rankMap.get(grade[i]);
        }

        System.out.println(Arrays.toString(ranks));
    }
}
