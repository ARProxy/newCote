package P2024_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        if(m != 0) {
            for (int i = 0; i < m; i++) {
                list.add(sc.nextInt());
            }

            String str = String.valueOf(n);
            String[] arr = str.split("");
            for (int i = 0; i < arr.length; i++) {

            }



        } else {
            System.out.println(String.valueOf(n).length());
        }
        sc.close();
    }
}
