package P2024_01;

import java.util.*;

public class B_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n+1];
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            str[i] = sc.nextLine();

            String[] command = str[i].split(" ");
            switch(command[0]) {
                case "push":
                    queue.add(Integer.valueOf(command[1]));
                    list.add(Integer.valueOf(command[1]));
                    break;
                case "pop":
                    Integer addPop = queue.poll();
                    list.add(addPop == null ? -1 : addPop);
                    break;
                case "size":
                    Integer addSize = queue.size();
                    list.add(addSize == null ? -1 : addSize);
                    break;
                case "empty":
                    if(queue.isEmpty()) {
                        list.add(1);
                    } else {
                        list.add(0);
                    }
                    break;
                case "front":
//                    Integer addFront = queue.peek();
//                    list.add(addFront == null ? -1 : addFront);
                    break;
                case "back":
//                    Integer addBack = queue.peekLast();
//                    list.add(addBack == null ? -1 : addBack);
                    break;
            }
        }
        System.out.println(Arrays.toString(str));
        System.out.println(list);
        sc.close();
    }
}
