package P2024_01;

import java.util.*;

public class B_26042 {
    static int student;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<int[]> list = new ArrayList<>() {
            {
                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();
                    if(a == 1) {
                        add(new int[] {a, sc.nextInt()});
                    } else {
                        add((new int[] {a}));
                    }
                }
            }
        };
        int maxSize = 0;


        List<Integer> minStudent = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)[0] == 1) {
                queue.offer(list.get(i)[1]);
                if(queue.size() > maxSize) {
                    maxSize = queue.size();
                    student = list.get(i)[1];
                    minStudent.add(student);
                }
            } else {
                if(!queue.isEmpty()) {
                    queue.poll();
                }

            }
        }
        System.out.println(maxSize + " " + minStudent.stream().mapToInt(i -> i).min().orElse(0));
        sc.close();
    }
}
