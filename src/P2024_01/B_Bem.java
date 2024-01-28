package P2024_01;

public class B_Bem {
    public static void main(String[] args) {
        //사과를 먹으면 뱀 길이가 늘어난다.
        //벽 또는 자기 몸과 부딪히면 게임 오버
        int n = 6;

    }
}
//import java.util.*;
//
//class Node {
//    int x;
//    int y;
//
//    Node(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}
//
//public class DummyGame {
//    public static int N, K, L;
//    public static int[][] board;
//    public static int[] time;
//    public static char[] direction;
//    public static ArrayList<Node> snake = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        N = sc.nextInt();
//        board = new int[N + 1][N + 1];
//
//        K = sc.nextInt();
//        for (int i = 0; i < K; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            board[a][b] = 1; // 사과 위치 표시
//        }
//
//        L = sc.nextInt();
//        time = new int[L];
//        direction = new char[L];
//        for (int i = 0; i < L; i++) {
//            time[i] = sc.nextInt();
//            direction[i] = sc.next().charAt(0);
//        }
//
//        System.out.println(simulate());
//    }
//
//    public static int simulate() {
//        int x = 1, y = 1; // 초기 위치
//        board[x][y] = 2; // 뱀의 위치 표시
//        snake.add(new Node(x, y));
//
//        int dir = 0; // 오른쪽을 보고 시작
//        int[] dx = {0, 1, 0, -1};
//        int[] dy = {1, 0, -1, 0};
//
//        int index = 0;
//        int second = 0;
//
//        while (true) {
//            if (index < L && second == time[index]) {
//                dir = (dir + (direction[index] == 'L' ? 3 : 1)) % 4;
//                index++;
//            }
//
//            int nx = x + dx[dir];
//            int ny = y + dy[dir];
//            second++;
//
//            if (nx < 1 || ny < 1 || nx > N || ny > N) break; // 벽에 부딪힘
//            if (board[nx][ny] == 2) break; // 자신의 몸에 부딪힘
//
//            if (board[nx][ny] == 1) {
//                board[nx][ny] = 2;
//                snake.add(new Node(nx, ny));
//            } else {
//                board[nx][ny] = 2;
//                snake.add(new Node(nx, ny));
//                Node tail = snake.remove(0);
//                board[tail.x][tail.y] = 0;
//            }
//
//            x = nx;
//            y = ny;
//        }
//
//        return second;
//    }
//}
