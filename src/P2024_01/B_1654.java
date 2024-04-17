package P2024_01;

import java.util.Scanner;

public class B_1654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] len = new int[n];
		for (int i = 0; i < n; i++) {
			len[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += len[i];
		}

		int maxLength = (int)sum / m;

		while (true) {
			int refreshSum = 0;
			for (int i = 0; i < n; i++) {
				refreshSum += len[i] / maxLength;
			}
			if (refreshSum == m) {
				break;
			}
			maxLength--;
		}
		System.out.println(maxLength);
		sc.close();
	}
}
