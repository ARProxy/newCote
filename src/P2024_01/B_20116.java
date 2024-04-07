package P2024_01;

import java.util.Arrays;
import java.util.Scanner;

public class B_20116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] center = new int[n];
        for(int i = 0; i < n; i++) {
            center[i] = sc.nextInt();
        }

        double maxX = center[0] - l;
        double maxY = center[0] - l;

        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = center[i - 1] + sum[i - 1];
        }

        double max = (double) sum[n] / (n - 1);

        if(max < maxY || max > maxX) {
            System.out.println("stable");
        } else {
            System.out.println("unstable");
        }
        sc.close();
    }
}
