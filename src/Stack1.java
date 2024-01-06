import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<number; i++) {
            String[] temp = sc.nextLine().split(" ");
            if(temp[0].equals("push")) {
                stack.push(Integer.parseInt(temp[1]));
            } else if(temp[0].equals("size")) {
                System.out.println(stack.size());
            } else if(temp[0].equals("empty")) {
                if(stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(temp[0].equals("top")) {
                if(stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            } else {
                if(stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }
        }
        sc.close();
    }
}
