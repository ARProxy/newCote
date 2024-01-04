package P2024_01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredictedBracket {
    public static void main(String[] args) {
        int n = 8;
        int a = 4;
        int b = 7;

//        System.out.println(Integer.toBinaryString((a-1)^(b-1)));

        int round = 1;
        while (true) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;

            if (a == b) {
                break;
            }
            round++;
        }
        System.out.println("A와 B는 " + round + "번째 라운드에서 만납니다.");
    }
}

// [1 2] [3 4] [5 6] [7 8]
// [1 4] [5 7]
// [4 7]