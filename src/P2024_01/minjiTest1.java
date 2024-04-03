package P2024_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minjiTest1 {
    public static void main(String[] args) {
        int result = 140;
        int[] mockDate = {1, 10, 21, 34,70,100,350,1225,1500};
        List<Integer> coins = new ArrayList<>();
        for (int i = 0; i < mockDate.length; i++) {
            if(mockDate[i] < result) {
                coins.add(mockDate[i]);
            }
        }
        Collections.sort(coins, Collections.reverseOrder());

        int count = 0;
        for (int coin : coins) {
            if(result <= 0) {
                break;
            }
            count += result / coin;
            result %= coin;
        }

        System.out.println(count);
    }
}
