package P2024_01;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class B_2606 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String[] str = sc.nextLine().split(" ");
            int node1 = Integer.parseInt(str[0]);
            int node2 = Integer.parseInt(str[1]);

            List<Integer> temp = map.getOrDefault(node1, new ArrayList<>());
            temp.add(node2);

            map.put(node1, temp);

            List<Integer> temp2 = map.getOrDefault(node2, new ArrayList<>());
            temp2.add(node1);

            map.put(node2, temp2);
        }
        System.out.println(map);
        int[] visited = new int[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        int count = 0;
        visited[1] = 1;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int a : map.get(cur)) {
                if (visited[a] == 0) {
                    queue.add(a);
                    visited[a] = 1;
                    count++;
                }
            }

        }
        System.out.println(count);
        sc.close();
    }
}
