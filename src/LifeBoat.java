import java.util.*;

public class LifeBoat {
    public static void main(String[] args) {
        int[] people = {70, 80, 50, 25, 25, 20};
        int limit = 100;

        Arrays.sort(people);
        int i=0, j=people.length-1;
        int boats = 0;

        while(i <= j) {
            if(people[i] + people[j] <= limit) {
                i++;
//                System.out.println(i);
            }
            j--;
            System.out.println(j);
            boats++;
            System.out.println(boats);
        }
//        System.out.println(boats);
//        int sum = 0;
//
//        List<Integer> list = new ArrayList<>();
//        for(Integer person : people) {
//            list.add(person);
//        }
//
//        for(int i=0; i<list.size(); i++) {
//            if(list.get(i) <= limit / 2) {
//                list.remove(list.get(i));
//                sum++;
//            }
//        }
//        int result = 0;
//        int boat = (sum/2) == 0 ? 1 : sum/2;
//        result = boat + list.size();
//        System.out.println(result);
//        Arrays.sort(people);
//
//        List<Integer> list = new ArrayList<>();
//        for(int person : people) {
//            list.add(person);
//        }
//
//        int boats = 0;
//        while (!list.isEmpty()) {
//            int i = list.size() - 1; // 가장 무거운 사람
//            if (list.get(i) <= limit / 2) {
//                // 가장 무거운 사람이 무게 제한의 절반 이하인 경우,
//                // 두 명씩 태울 수 있으므로 보트 수 계산
//                boats += (list.size() + 1) / 2;
//                break;
//            } else {
//                // 가장 무거운 사람과 함께 탈 수 있는 가장 가벼운 사람을 찾음
//                int j = 0;
//                while (j < i && list.get(i) + list.get(j) > limit) {
//                    j++;
//                }
//                if (j < i) {
//                    // 가벼운 사람과 함께 탈 수 있음
//                    list.remove(j);
//                }
//                // 가장 무거운 사람을 보트에 태움
//                list.remove(i);
//                boats++;
//            }
//        }
//        System.out.println(boats);

    }
}
