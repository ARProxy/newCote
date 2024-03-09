package P2024_01;

import java.util.*;

public class B_2346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Map.Entry<Integer, Integer>> queue = new LinkedList<>() {
            {
                for (int i = 1; i <= n ; i++) {
                    offer(new AbstractMap.SimpleEntry<>(i, sc.nextInt()));
                }
            }
        };
        String result = "";
        while (!queue.isEmpty()) {
            Map.Entry<Integer, Integer> current = queue.poll();
            if (current == null) {
                break;
            }
            result += current.getKey() + (queue.isEmpty() ? "" : " ");

            if(current.getValue() > 0 && !queue.isEmpty()) {
                for (int i = 0; i < current.getValue() - 1; i++) {
                    queue.offerLast(queue.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(current.getValue()); i++) {
                    queue.offerFirst(queue.pollLast());
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}
