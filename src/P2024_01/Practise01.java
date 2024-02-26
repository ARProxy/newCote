package P2024_01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Practise01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int computer = sc.nextInt();
//        int size = sc.nextInt();
//
//        List<int[]> list = new ArrayList<>() {{
//            for (int i = 1; i <= size; i++) {
//                add(new int[] {sc.nextInt(), sc.nextInt()});
//            }
//        }};
//        for(int[] arr : list) {
//            System.out.println(Arrays.toString(arr));
//        }
//        List<Map<Integer, List<Integer>>> mapList = new ArrayList<>() {{
//
//            for(int[] connection : list) {
//                Map<Integer, List<Integer>> connections = new HashMap<>();
//                int start = connection[0];
//                int end = connection[1];
//
//                connections.putIfAbsent(start, new ArrayList<>());
//                connections.get(start).add(end);
//
//                connections.putIfAbsent(end, new ArrayList<>());
//                connections.get(end).add(start);
//
//            }
//
//        }};
//        Map<Integer, List<Integer>> computerConnections = new HashMap<>();
//        for (int[] connection : list) {
//            int start = connection[0];
//            int end = connection[1];
//
//            computerConnections.putIfAbsent(start, new ArrayList<>());
//            computerConnections.get(start).add(end);
//
//            computerConnections.putIfAbsent(end, new ArrayList<>());
//            computerConnections.get(end).add(start);
//        }
//
//        for (Map.Entry<Integer, List<Integer>> entry : computerConnections.entrySet()) {
//            System.out.println("Computer " + entry.getKey() + " is connected to " + entry.getValue());
//        }
//        sc.close();

        DayOfWeek date = LocalDate.now().getDayOfWeek();
        System.out.println(date);
    }
}
