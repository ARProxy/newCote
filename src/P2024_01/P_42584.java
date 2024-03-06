package P2024_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P_42584 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,2,3);
        Solution42584 so = new Solution42584();
        System.out.println(so.solution(list));
    }
}
class Solution42584 {
    public List<Integer> solution(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) <= list.get(j)) {
                    sum++;
                }
            }
            result.add(sum);
        }
        return result;
    }
}
//    public List<Integer> solution1(List<Integer> list) {
//        return IntStream.range(0, list.size())
//                .map(i -> IntStream.range(i + 1, list.size())
//                        .
//                )
//    }
//}
//class Solution {
//    public List<Integer> solution(int[] prices) {
//        List<Integer> list = IntStream.range(0, prices.length)
//                .boxed().collect(Collectors.toList());
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < list.size() ; i++) {
//            int sum = 0;
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i) <= list.get(j)) {
//                    sum++;
//                }
//            }
//            result.add(sum);
//        }
//        return result;
//    }
//}