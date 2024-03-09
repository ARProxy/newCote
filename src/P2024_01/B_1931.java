package P2024_01;

import java.util.*;

public class B_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<int[]> lists = new ArrayList<>() {
            {

                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    add(new int[] {a, b, b - a});
                }
            }
        };

        Collections.sort(lists, (a1, a2) -> {
            return a1[1] - a2[1];
        });

        for(int[] list : lists) {
            System.out.println(Arrays.toString(list));
        }

        List<int[]> result = new ArrayList<>();
        result.add(lists.get(0));

        sc.close();
    }
}