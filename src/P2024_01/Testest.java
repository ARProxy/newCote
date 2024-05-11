package P2024_01;

public class Testest {
	public static void main(String[] args) {
		int num = 1234;
		int div = 10;
		int result = 0;

		while (num != 0) {
			result = result * div;
			result += num % div;
			num = result / div;
		}

		System.out.println(result);
	}
}
