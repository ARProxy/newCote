package P2024_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class B_1337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>() {
            {
                for (int i = 0; i < n; i++) {
                    add(sc.nextInt());
                }
            }
        };
        Collections.sort(list);
        System.out.println(list);

        List<Integer> arrayCount = new ArrayList<>();
        while (true) {
            int count = 0;
            for (int value : list) {
                int sum = 0;
                for (int i = value; i < list.size() ; i++) {
                    sum += i;
                    if(fiveSum(value) == sum) {
                        break;
                    } else {
                        for (int j = 0; j < 5; j++) {
                            int valuePlus = value++;
                            if (!list.contains(valuePlus)) {
                                count++;
                            }
                        }
                    }
                }

            }
            if (count == 0) {
                break;
            }
            arrayCount.add(count);
            System.out.println(count);
        }

    }
    private static int fiveSum(int value) {
        return IntStream.range(value, value + 5).sum();
    }
}
