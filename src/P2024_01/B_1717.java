package P2024_01;

import java.util.Arrays;
import java.util.Scanner;

public class B_1717 {
    private static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[m][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        parent = new int[n + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

//        for (int[] ar : arr) {
//            if(ar[0] == 0) {
//                union(1, 3);
//            } else {
//
//            }
//
//        }

        System.out.println(union(1, 7));


        sc.close();
    }
    private static boolean union(int x, int y) {
        x = find(x);
        y = find(y);

        if(x == y) {
            return false;
        }

        if(x <= y) {
            parent[y] = x;
        } else {
            parent[x] = y;
        }
        return true;
    }

    private static int find(int x) {
        if(parent[x] == x) {
            return x;
        }
        return find(parent[x]);
    }
}
