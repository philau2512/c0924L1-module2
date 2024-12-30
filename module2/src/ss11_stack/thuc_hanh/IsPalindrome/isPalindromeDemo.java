package ss11_stack.thuc_hanh.IsPalindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class isPalindromeDemo {
    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : string.toCharArray()) {
            stack.push(c);
            queue.offer(c);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {  // 1 cái lấy ngược 1 cái lấy xuôi, ko bằng thì là false
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String string = "abcbaf";
        System.out.println("isPalindrome : " + isPalindrome(string));
    }
}
