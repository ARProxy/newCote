package P2024_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B_16401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;
        List<Integer> list = new ArrayList<>() {
            {
                for (int i = 0; i < n; i++) {
                    add(sc.nextInt());
                }
            }
        };
        Collections.sort(list);
        Collections.reverse(list);
        if(list.size() >= m) {
            for (int i = 0; i < m - 1; i++) {
                result = Math.min(list.get(i), list.get(i + 1));
            }
        } else {
            int different = m % list.size() + 1;
            int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
            result = max / different;
        }
        System.out.println(result);
        sc.close();
    }
}
