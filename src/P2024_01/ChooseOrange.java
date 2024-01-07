package P2024_01;

import java.util.*;

public class ChooseOrange {
    public static void main(String[] args) {
        int k = 6;
        int[] orange = {1, 3, 2, 5, 4, 5, 2, 3};
        List<Integer> list = new ArrayList<>();
        for(int value : orange) {
            list.add(value);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            System.out.println(map);
        }
        List<Integer> countOrange = new ArrayList<>();
        map.forEach((number, counter) -> {
            countOrange.add(counter);
            System.out.println(map);
        });
        Collections.sort(countOrange);
        Collections.reverse(countOrange);
        int sum = 0;
        int temp = 0;
        for(int i=0; i<countOrange.size(); i++) {
            temp += countOrange.get(i);
            if(temp >= k) {
                sum++;
                break;
            } else {
                sum++;
            }
        }
        System.out.println(sum);
        Solution03 so = new Solution03();
        System.out.println(so.solution(k, orange));
    }
}
class Solution03 {
    public int solution(int k, int[] orange) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : orange) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> countOrange = new ArrayList<>(map.values());
        Collections.sort(countOrange, Collections.reverseOrder());

        int sum = 0, temp = 0;
        for(int count : countOrange) {
            temp += count;
            sum++;
            if(temp >= k) break;
        }
        return sum;
    }
}