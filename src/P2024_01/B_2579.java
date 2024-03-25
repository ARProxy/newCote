package P2024_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_2579 {

    static List<Integer> list;
    static int answer = 0; // 전역 변수로 최대 합계를 저장

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();

        list = new ArrayList<>();
        for (int i = 0; i < start; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> path = new ArrayList<>();
        findPaths(start - 1, path);

        System.out.println(answer); // 모든 탐색이 끝난 후 최대 합계 출력

        sc.close();
    }

    public static void findPaths(int current, List<Integer> path) {
        path.add(current); // 현재 숫자를 경로에 추가

        if (current == 0) {
            int sum = 0;
            for (int value : path) {
                sum += list.get(value);
            }
            answer = Math.max(sum, answer); // 최대 합계 업데이트
            path.remove(path.size() - 1); // 백트래킹
            return;
        }

        for (int next = current - 1; next >= current - 2 && next >= 0; next--) {
            if (path.size() < 2 || !(path.get(path.size() - 2) == next + 2 && path.get(path.size() - 1) == next + 1)) {
                List<Integer> newPath = new ArrayList<>(path); // 현재 경로를 복사하여 새 경로 생성
                findPaths(next, newPath); // 재귀적으로 다음 경로 탐색
            }
        }

        path.remove(path.size() - 1); // 백트래킹
    }
}

