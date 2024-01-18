package P2024_01;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class B_souvenir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        for(int i=0; i<n; i++) {
            queue.add(String.valueOf(i+1));
        }
        System.out.println(queue);
        int sum = 1;
        while(queue.size() > 1) {

            int game = (int)Math.pow(sum, 3);
                

            sum++;
        }
        sc.close();
    }
}
