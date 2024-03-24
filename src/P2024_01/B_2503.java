package P2024_01;

import java.util.*;

public class B_2503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        List<String[]> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           lists.add(sc.nextLine().split(" "));
        }
        Collections.sort(lists, (a1, a2) -> {
            return Integer.parseInt(a1[1]) - Integer.parseInt(a2[1]);
        });

        for(String[] str : lists) {
            System.out.println(Arrays.toString(str));
        }

        for (int i = n; i > 0; i--) {

        }

        sc.close();
    }
}
