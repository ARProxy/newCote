package P2024_01;

import java.util.*;

public class B_3986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextLine().split(""));
        }
        int count = 0;
        for (String[] words : list) {
            Stack<String> stack = new Stack<>();

            for (String word : words) {
                if (!stack.isEmpty() && stack.peek().equals(word)) {
                    stack.pop();
                    count++;
                } else {
                    stack.push(word);
                }
            }

        }

        System.out.println(count);
        sc.close();
    }
}
