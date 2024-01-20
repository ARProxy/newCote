package P2024_01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class B_Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            Deque<Character> deque = new ArrayDeque<>();
            deque.offer(ch[0]);
            for(int j=2; j<ch.length; j+=2) {
                char curr = ch[j];
                if(deque.peekFirst() >= curr) {
                    deque.offerFirst(curr);
                } else {
                    deque.offerLast(curr);
                }
            }
            String result = deque.stream()
                     .map(c -> Character.toString(c))
                     .collect(Collectors.joining());

            System.out.println(result);
//            StringBuilder sb = new StringBuilder();
//            for(char a : deque) {
//                sb.append(a);
//            }
//            System.out.println(sb);
        }
    }
}
