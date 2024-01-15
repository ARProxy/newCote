package P2024_01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;
/*
    메모리 : 27716 KB
    시간 : 272 ms
 */
public class QueueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            result.add(queue.poll());
        }
        result.add(queue.poll());
        System.out.println("<" + result.stream().map(String::valueOf).collect(Collectors.joining(", ")) + ">");
        sc.close();
    }
}
//    StringBuilder sb = new StringBuilder();
//        sb.append('<');
//
//                while (!queue.isEmpty()) {
//                // K-1번 사람까지는 큐의 뒤로 옮김
//                for (int i = 0; i < k - 1; i++) {
//        int temp = queue.poll();
//        queue.add(temp);
//        }
//        // K번째 사람을 제거
//        sb.append(queue.poll());
//
//        if (!queue.isEmpty()) {
//        sb.append(", ");
//        }
//        }
//
//        sb.append('>');
//
//        System.out.println(sb.toString());







