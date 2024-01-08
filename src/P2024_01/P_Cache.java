package P2024_01;

import java.util.*;

public class P_Cache {
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        if(cacheSize == 0) {
            System.out.println(5 * cities.length);
        }
        int time = 0;
        List<String> cache = new LinkedList<>();

        for(String city : cities) {
            city = city.toLowerCase();

            if(cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                time++;
                System.out.println(cache);
                System.out.println(time);
            } else {
                if(cache.size() == cacheSize) {
                    cache.remove(0);
                }
                cache.add(city);
                time += 5;
                System.out.println(cache);
                System.out.println(time);
            }
        }
        System.out.println(time);

        Solution003 so = new Solution003();
        System.out.println(so.solution(cacheSize, cities));
    }
}
class Solution003 {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return 5 * cities.length;

        LinkedHashMap<String, Integer> cache = new LinkedHashMap<String, Integer>(cacheSize, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                System.out.println(eldest);
                return size() > cacheSize;
            }
        };

        int time = 0;
        for (String city : cities) {
            city = city.toLowerCase();
            if (cache.containsKey(city)) {
                time++; // cache hit
            } else {
                time += 5; // cache miss
            }
            cache.put(city, 1);

        }
        return time;

    }
}