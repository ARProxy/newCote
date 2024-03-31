package P2024_01;

import java.util.ArrayList;
import java.util.List;

public class P_181870 {
    public static void main(String[] args) {
        String[] str = {"and","notad","abcd"};
        String check = "ad";
        System.out.println(solution(str, check));
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < str.length; i++) {
//            if (!str[i].contains(check)) {
//                list.add(str[i]);
//            }
//        }
//        System.out.println(list);
    }
    private static List<String> solution(String[] str, String check) {
        return new ArrayList<>(){{
            for (String s : str) {
                if (!s.contains(check)) {
                    add(s);
                }
            }
        }};
    }
}
