package P2024_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_10974 {
   static int n;
   static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            visited = new boolean[n+1];

            dfs(i);

        }

        sc.close();
    }
    private static void dfs(int i) {

        if(i > n || i < 1) {
            System.out.println();
            return;
        }
        System.out.print(i);
        if(visited[i] == true) return;
        visited[i] = true;
        dfs(i - 1);
        dfs(i + 1);
//        if ((i -1) > 0) {
//            dfs(i - 1);
//        }
//        visited[i] = false;
//        if ((i +1) <= n) {
//            dfs(i + 1);
//        }
    }
}
