package P2024_01;

import java.util.*;

public class B_1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int a = 0, b = 0;
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int[][] arr = new int[m][2];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            Arrays.sort(arr, (a1, a2) -> {
                return a1[0] - a2[0];
            });

            System.out.println(Arrays.deepToString(arr));
        }
        sc.close();
    }
}
