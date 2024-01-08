package P2024_01;

import java.util.Scanner;
import java.util.Stack;

public class B_Top {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i=0; i<n; i++) {
            heights[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        for(int i=0; i<n; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] < heights[i]) {
                stack.pop();
                System.out.println(stack);
            }
            if(stack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = stack.peek() + 1;
                System.out.println(stack);
            }
            stack.push(i);
            System.out.println(stack);
        }
        for(int i=0; i<n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
//