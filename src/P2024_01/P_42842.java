package P2024_01;

import java.math.BigInteger;
import java.util.Arrays;

public class P_42842 {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        int[] result = new int[2];
        int sum = Integer.MAX_VALUE;
        for (int i = 1; i <= yellow / 2; i++) {
            if (yellow % i == 0) {
                int x = i;
                int y = yellow / i;
                if(sum < x + y) {
                    result[0] = i;
                    result[1] = yellow / i;
                    break;
                }
                sum = Math.min(sum, x + y);
            }
        }
        System.out.println(Arrays.toString(result));
        System.out.println(sum);
    }
}
