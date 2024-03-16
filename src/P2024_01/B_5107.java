package P2024_01;

import java.util.*;

public class B_5107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCaseNum = 0;

        while (true) {
            ++testCaseNum;
            int n = sc.nextInt();
            sc.nextLine();
            if(n == 0) {
                break;
            }
            Map<String, String> map = new HashMap<>();
            Map<String, Boolean> countMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String[] s = sc.nextLine().split(" ");
                map.put(s[0], s[1]);
                countMap.put(s[0], false);
            }
            int result = 0;
            for(String key : countMap.keySet()) {
                if (countMap.get(key)) {
                    continue;
                }
                while (!countMap.get(key)) {
                    countMap.put(key, true);
                    key = map.get(key);

                }
                result += 1;
            }
            System.out.println(map);
            System.out.println(testCaseNum + " " + result);

        }
        sc.close();
    }
}
