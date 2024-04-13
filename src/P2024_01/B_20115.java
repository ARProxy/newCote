package P2024_01;

import java.util.Arrays;
import java.util.Scanner;

public class B_20115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] energe = new int[n];
        for (int i = 0; i < n; i++) {
            energe[i] = sc.nextInt();
        }

        Arrays.sort(energe);
        double sum = energe[n - 1];
        for (int i = 0; i < n - 1; i++) {
            sum += (double) energe[i] / 2;
        }
        System.out.println(sum);

        sc.close();
    }
}
