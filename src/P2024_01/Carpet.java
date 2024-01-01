package P2024_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carpet {
    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;

        int total = brown + yellow;

        for(int height = 3; height <= (total / height); height++) {
            int width = total / height;
            if((width - 2) * (height - 2) == yellow) {
                System.out.println(Arrays.toString(new int[]{width, height}));
            }
        }
    }
}
//어떻게 노랭이 2개 주변으로 채운 사각형 브라운 10개를 만들까