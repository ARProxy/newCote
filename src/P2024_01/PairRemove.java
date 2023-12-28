package P2024_01;

import java.util.*;

public class PairRemove {
    public static void main(String[] args) {
        String s1 = "baabaa";
        String s2 = "cdcd";

        List<String> list = new ArrayList<>(Arrays.asList(s1.split("")));
        int result = 0;

        int firstLength = list.size();
        while(true) {
            int lastLength = 0;
            for(int i=0; i<list.size()-1; i++) {
                if(list.get(i).equals(list.get(i+1))) {
                    list.remove(list.get(i));
                    list.remove(list.get(i));
                }
                lastLength = list.size();
            }
            if(firstLength == lastLength) {
                break;
            }
            if(list.isEmpty()) {
                result = 1;
                break;
            }
        }
        System.out.println(result);

        Solution0 so = new Solution0();
        int answer = so.solution(s1);
        System.out.println(answer);

    }
}
class Solution0 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                System.out.println(stack);
            } else {
                stack.push(c);
                System.out.println(stack);
            }

        }
        int result = stack.isEmpty() ? 1 : 0;
        return result;
    }
}