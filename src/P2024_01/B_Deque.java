package P2024_01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B_Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0; i<n; i++) {
            String order = sc.next();

            if(order.equals("push_front")) {
                deque.offerFirst(sc.nextInt());
            } else if(order.equals("push_back")) {
                deque.offerLast(sc.nextInt());
            } else if(order.equals("pop_front")) {

                if(deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollFirst());
                }

            } else if(order.equals("pop_back")) {

                if(deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(deque.pollLast());
                }

            } else if(order.equals("size")) {
                System.out.println(deque.size());
            } else if(order.equals("empty")) {

                if(deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }

            } else if(order.equals("front")) {
                Integer temp = deque.peekFirst();
                if(temp == null) {
                    temp = -1;
                }
                System.out.println(temp);
            } else {
                Integer temp = deque.peekLast();
                if(temp == null) {
                    temp = -1;
                }
                System.out.println(temp);
            }
        }
    }
}
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        Deque<Integer> deque = new ArrayDeque<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            String order = st.nextToken();
//
//            switch (order) {
//                case "push_front":
//                    deque.offerFirst(Integer.parseInt(st.nextToken()));
//                    break;
//                case "push_back":
//                    deque.offerLast(Integer.parseInt(st.nextToken()));
//                    break;
//                case "pop_front":
//                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
//                    break;
//                case "pop_back":
//                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
//                    break;
//                case "size":
//                    sb.append(deque.size()).append("\n");
//                    break;
//                case "empty":
//                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
//                    break;
//                case "front":
//                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
//                    break;
//                default: // back
//                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
//                    break;
//            }
//        }
//
//        System.out.print(sb.toString());
//    }
//}