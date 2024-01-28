package P2024_01;

import java.util.*;

public class WordChange {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        Solution10 so = new Solution10();
        System.out.println(so.solution(begin, target, words));
    }
}
class Solution10 {
    public int solution(String begin, String target, String[] words) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put(begin, new ArrayList<>());
        for (int j = 0; j < words.length; j++) {
            if(compareWord(begin, words[j])) {
                graph.get(begin).add(words[j]);
            }
        }
        for (int i = 0; i < words.length; i++) {
            graph.put(words[i], new ArrayList<>());
            for (int j = 0; j < words.length; j++) {
                if(i == j) continue;
                if(compareWord(words[i], words[j])) {
                    graph.get(words[i]).add(words[j]);
                }
            }
        }
        Set<String> visited = new HashSet<>(List.of(begin));
        Queue<AbstractMap.SimpleEntry<String, Integer>> queue = new LinkedList<>(List.of(new AbstractMap.SimpleEntry<>(begin, 0)));
        while (!queue.isEmpty()) {
            AbstractMap.SimpleEntry<String, Integer> outed = queue.poll();
            System.out.println(outed);
            if (outed.getKey().equals(target)) {
                return outed.getValue();
            }
            for(String next : graph.get(outed.getKey())) {
                if(visited.contains(next)) continue;
                visited.add(next);
                queue.offer(new AbstractMap.SimpleEntry<>(next, outed.getValue() + 1));
            }
        }
        System.out.println(graph);
        return 0;
    }
    private boolean compareWord(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}
