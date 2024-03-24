package P2024_01;

import java.util.*;

public class B21967 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] bansuk = new int[n];
        for (int i = 0; i < n; i++) {
            bansuk[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(bansuk));
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 1;
        int max = 0;
        while (start != end) {
            for (int i = 0; i < bansuk.length; i++) {
                if(Math.abs(bansuk[start] - bansuk[end]) > 2) {
                    max = Math.max(max, end - start);
                    break;
                }
                end++;
            }
            start++;
        }
        System.out.println(max);
//        dong: for (int i = 0; i < n / 2; i++) {
//            for (int j = start; j <= end; j++) {
//                if (Math.abs(bansuk[i] - bansuk[j]) > 2) {
//                    max = Math.max(max, end - start);
//                    break;
//                } else {
//                    end++;
//                }
//            }
//        }
        System.out.println(max);
    }
}
