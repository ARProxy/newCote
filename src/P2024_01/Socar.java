package P2024_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Socar {
    public static void main(String[] args) {
        int[] number = {3, 7, 2, 8, 6, 4, 5, 1};
        int k = 3;

        int swapCount = 0;
        List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());

        while (true) {
            List<Integer> diffList = new ArrayList<>();
            for(int i=0; i<list.size()-1; i++) {
                diffList.add(Math.abs(list.get(i+1) - list.get(i)));
            }
            int maxValue = Collections.max(diffList);
            if(maxValue <= k) {
                break;
            }
            int index = diffList.indexOf(maxValue);
            int bigNumber = Math.max(list.get(index), list.get(index + 1));
            int smallNumber = Math.min(list.get(index), list.get(index + 1));

            int targetNumber = bigNumber - k;
            SocarFind socar = new SocarFind();
            int closestNumber = socar.find(list, targetNumber);

            Collections.swap(list, list.indexOf(smallNumber), list.indexOf(closestNumber));
            swapCount++;
        }
        System.out.println(swapCount);
    }
}

class SocarFind {
    public int find(List<Integer> list, int target) {
        if(list.contains(target)) {
            return target;
        }
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) < target) {
                temp.add(list.get(i));
            }
        }
        return Collections.max(temp);
    }
}