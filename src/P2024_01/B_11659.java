package P2024_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> list = new ArrayList<>() {
            {
                for (int i = 0; i < N; i++) {
                    add(sc.nextInt());
                }
            }
        };

        dong: for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum = 0;
            if (start == end) {
                sum = list.get(end - 1);
                System.out.println(sum);
                continue dong;
            }
            for (int j = start - 1; j < end; j++) {
                sum += list.get(j);
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
