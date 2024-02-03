package P2024_01;

import java.util.Arrays;
import java.util.Scanner;

public class B_6146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
        x = n - x;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int[][] grid = new int[n * 2][n * 2];

        for (int i = 0; i < n; i++) {
            int temp1 = sc.nextInt();
            int temp2 = sc.nextInt();
            grid[n - temp1][n - temp2] = 1;
            minX = Math.min(minX, temp1);
            minY = Math.min(minY, temp2);

        }
        int destX = n;
        int destY = n;
        System.out.println(destX + "------" + destY);
        for(int[] ar : grid) {
            System.out.println(Arrays.toString(ar));
        }
        sc.close();
    }
}
