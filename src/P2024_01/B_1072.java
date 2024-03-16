package P2024_01;

import java.util.Scanner;

public class B_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        long z = y * 100 / x;
        long answer = -1;
        if(z < 100) {
            long start = 0;
            long end = 1000000000;
            while (start <= end) {
                long mid = (start + end) / 2;
                long newZ = (y + mid) * 100 / (x + mid);
                if (newZ > z) {
                    answer = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                System.out.println(answer);
            }
        }
        System.out.println(answer);
        sc.close();
//        Scanner sc = new Scanner(System.in);
//
//        double x = (double) sc.nextInt();
//        double y = (double) sc.nextInt();
//
//        double z = Math.floor(y / x * 100);
//        double zz = z;
//        int sum = 0;
//        if(z == 100.0) {
//            sum = -1;
//        } else {
//            while(true) {
//                x++;
//                y++;
//                sum++;
//                zz = Math.floor(y / x * 100);
//                if(z != zz || z >= 100) {
//                    break;
//                }
//            }
//        }
//        System.out.println(sum);
//        sc.close();
    }
}
