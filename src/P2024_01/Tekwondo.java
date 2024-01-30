package P2024_01;

import java.util.*;
import java.util.stream.Collectors;

public class Tekwondo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 커맨드 + 알트 + l == 정렬
        // shift + f6 == 모든 단어 변경

        int c = sc.nextInt();
        List<List<Integer>> lists = new ArrayList<>() {
            {
                for (int i = 0; i < c; i++) {
//                    add(Arrays.stream(new int[] {sc.nextInt(), sc.nextInt()})
//                            .boxed().collect(Collectors.toList()));
                    add(List.of(sc.nextInt(), sc.nextInt()));
                }
            }
        };

        int count = 0;

//        List<Integer> temp =
//        Queue<AbstractMap.SimpleEntry<Integer, Integer>> queue = new ArrayDeque<>(List.of())
//        Queue<Pair<Integer, Integer>> queue = new ArrayDeque<>(List.of(new Pair<>()))

//        List<List<Integer>> lists = new ArrayList<>() {
//            {
//                for (int i = 0; i < 10; i++) add(new ArrayList<>());
//            }
//            @Override
//            public boolean add(List<Integer> list) {
//                System.out.println("add: " + list);
//                return super.add(list);
//            }
//
//            @Override
//            public List<Integer> get(int index) {
//                System.out.println("get: " + index);
//                return super.get(index);
//            }
//        };



        //먼저 3을 더해보고 1을 더하는 회수가 자신보다 커질 경우 *2

        sc.close();
    }
    class Pair<T, S> {
        T first;

        S second;

        public Pair(T first, S second) {
            this.first = first;
            this.second = second;
        }
    }
}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int c = scanner.nextInt();
//        List<List<Integer>> lists = new ArrayList<>() {
//            {
//                for (int i = 0; i < c; i++) {
//                    add(List.of(scanner.nextInt(), scanner.nextInt()));
//                }
//            }
//        };
//        for (List<Integer> list : lists) {
//            int myScore = list.get(0);
//            int yourScore = list.get(1);
//            Queue<Triple<Integer, Integer, Integer>> queue = new ArrayDeque<>(List.of(new Triple<>(myScore, yourScore, 0)));
//            Set<Integer> visited = new HashSet<>(List.of(myScore));
//
//            while (!queue.isEmpty()) {
//                Triple<Integer, Integer, Integer> current = queue.poll();
//                int[] nexts = {current.first + 1, current.first * 2};
//
//                if (current.first.equals(current.second)) {
//                    System.out.println(current.third);
//                    break;
//                }
//                for (int i = 0; i < 2; i++) {
//                    int next = nexts[i];
//
//                    if (visited.contains(next)) continue;
//                    if (myScore < current.second && current.second <= 100) {
//                        visited.add(next);
//                        queue.offer(new Triple<>(next, current.second + (i == 1 ? 3 : 0), current.third + 1));
//                    }
//                }
//            }
//        }
//        scanner.close();
//    }
//
//    static class Triple<F, S, T> {
//        F first; // 나의 점수
//
//        S second; // 상대 점수
//
//        T third; // 단계
//
//        public Triple(F first, S second, T third) {
//            this.first = first;
//            this.second = second;
//            this.third = third;
//        }
//
//        @Override
//        public String toString() {
//            return "Triple{" +
//                    "first=" + first +
//                    ", second=" + second +
//                    ", third=" + third +
//                    '}';
//        }
//    }
//}


//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int c = scanner.nextInt();
//        List<List<Integer>> list = new ArrayList<>() {
//            {
//                for (int i = 0; i < c; i++) {
//                    add(List.of(scanner.nextInt(), scanner.nextInt()));
//                }
//            }
//        };
//        List<Integer> temp = list.get(0);
//        int myScore = temp.get(0);
//        int yourScore = temp.get(1);
//        Queue<Triple<Integer, Integer, Integer>> queue = new ArrayDeque<>(List.of(new Triple<>(myScore, yourScore, 0)));
//
//        while (!queue.isEmpty()) {
//            Triple<Integer, Integer, Integer> current = queue.poll();
//            int[] nexts = {current.first + 1, current.first * 2};
//
//            if (current.first.equals(current.second)) {
//                System.out.println(current.third);
//                break;
//            }
//            System.out.println(current + ", " + yourScore);
//            for (int i = 0; i < 2; i++) {
//                int next = nexts[i];
//
//                if (myScore < current.second && current.second <= 100) {
//                    queue.offer(new Triple<>(next, current.second + (i == 1 ? 3 : 0), current.third + 1));
//                }
//            }
//        }
//        System.out.println(list);
//
//        scanner.close();
//    }
//
//    static class Triple<F, S, T> {
//        F first; // 나의 점수
//
//        S second; // 상대 점수
//
//        T third; // 단계
//
//        public Triple(F first, S second, T third) {
//            this.first = first;
//            this.second = second;
//            this.third = third;
//        }
//
//        @Override
//        public String toString() {
//            return "Triple{" +
//                    "first=" + first +
//                    ", second=" + second +
//                    ", third=" + third +
//                    '}';
//        }
//    }
//}
//    To
//
//            희표



//    int n = sc.nextInt();
//        sc.nextLine();
//                List<List<Integer>> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//        list.add(
//        Arrays.stream(sc.nextLine().split(" "))
//        .map(Integer::parseInt)
//        .collect(Collectors.toList())
//        );
//        }
//        System.out.println(list);
//    private static List<Integer> shotA(List<Integer> list) {
//        int sumA = list.get(0) * 2;
//        int sumB = list.get(1) + 3;
//        return new ArrayList<>(List.of(sumA, sumB));
//    }
//    private static List<Integer> shotB(List<Integer> list) {
//        return new ArrayList<>(List.of(list.get(0) + 1, list.get(1)));
//    }
//    List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//        int count = 0;
//        while (list.get(i).get(0) < list.get(i).get(1)) {
//        if ((list.get(i).get(1) - list.get(i).get(0)) >= list.get(i).get(0)) {
//        list.set(i, shotA(list.get(i)));
//        count++;
//        } else {
//        list.set(i, shotB(list.get(i)));
//        count++;
//        }
//        }
//        result.add(count);
//        }
//        System.out.println(result);