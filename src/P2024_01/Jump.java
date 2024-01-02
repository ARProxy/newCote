package P2024_01;

import java.util.ArrayList;
import java.util.List;

public class Jump {
    public static void main(String[] args) {
        int n = 5000;
        int nn = 6;
        int nnn = 5000;

        int battery = 0;
        while(n > 0) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                battery++;
            }
        }
        System.out.println(battery);
    }
}
//+1 *2 *2 +1 -> 5
//순간이동은 건전지를 사용하지 않는다. 순간이동을 우선시해야 한다.
//나는 0에서 더해간다고 생각했는데 결과값에서 나눠가면서 하는 방법을 생각해야한다.