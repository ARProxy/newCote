package P2024_01;

import java.util.*;

public class B_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String commandLine = sc.nextLine();
            String[] command = commandLine.split(" ");

            switch(command[0]) {
                case "push":
                    int value = Integer.parseInt(command[1]);
                    queue.add(value);
                    break;
                case "pop":
                    Integer popValue = queue.poll();
                    list.add(popValue != null ? popValue : -1);
                    break;
                case "size":
                    list.add(queue.size());
                    break;
                case "empty":
                    list.add(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    list.add(queue.isEmpty() ? -1 : queue.peek());
                    break;
                case "back":
                    list.add(queue.isEmpty() ? -1 : (int)queue.toArray()[queue.size() - 1]);
                    break;
            }
        }
        sc.close();

        for(Integer num : list) {
            System.out.println(num);
        }
    }
}
