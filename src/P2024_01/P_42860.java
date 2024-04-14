package P2024_01;

public class P_42860 {
	public static void main(String[] args) {
		String name = "JAN";
		int len = name.length();
		int minMove = len - 1;
		int answer = 0;
		for (int i = 0; i < len; i++) {
			answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

			int next = i + 1;
			while (next < len && name.charAt(next) == 'A') {
				next++;
			}

			minMove = Math.min(minMove, i + len - next + i);
		}

		System.out.println(answer);
		System.out.println(minMove);

	}
}
