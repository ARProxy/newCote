package P2024_01;

import java.util.Arrays;
import java.util.Scanner;

public class B_3020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int[] obstacle = new int[n];

        for (int i = 0; i < n; i++) {
            obstacle[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(obstacle));
        sc.close();
    }
}
