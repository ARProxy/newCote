package P2024_01;

import java.lang.reflect.Array;
import java.util.*;

public class EnglishGame {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {
                "tank", "kick", "know",
                "wheel", "land", "dream",
                "mother", "robot", "tank"
        };
        String[] wordss = {
                "hello", "one",
                "even", "never",
                "now", "world",
                "draw"
        };
        String[] word = {
                "hello", "observe", "effect", "take", "either",
                "recognize", "encourage", "ensure", "establish", "hang",
                "gather", "refer", "reference", "estimate", "executive"
        };
        System.out.println(wordss[0].endsWith(wordss[1].substring(0, 1)));
        int[] answer = {0, 0};
        Set<String> set = new HashSet<>();
        set.add(words[0]);

        for(int i=1; i< words.length; i++) {
            if(set.contains(words[i]) || !words[i - 1].endsWith(words[i].substring(0, 1))) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                System.out.println(Arrays.toString(answer));
            }
            set.add(words[i]);
        }
//        Set<String> set = new LinkedHashSet<>();
//        set.add(words[0]);
//        int sum = 1;
//        for(int i=0; i<words.length-1; i++) {
//            set.add(words[i + 1]);
////            System.out.println(set.size());
////            System.out.println(i+1);
//            if(set.size() == i+2) {
//                if(words[i].substring(words[i].length()-1).equals(words[i+1].substring(0,1))) {
//                    sum++;
//                } else {
//                    System.out.println(sum + 1);
//                    break;
//                }
//            } else {
//                System.out.println(sum);
//                break;
//            }
//        }

    }
}
