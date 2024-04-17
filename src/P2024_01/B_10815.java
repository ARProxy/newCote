package P2024_01;

import java.util.Arrays;
import java.util.Scanner;

public class B_10815 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//result 1 0 0 1 1 0 0 1
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int[] arr2 = new int[m];
		Arrays.fill(arr2, 0);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i] == arr1[j]) {
					arr2[j] = 1;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));

		sc.close();
	}
}
