package ss11_stack.bai_tap.is_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        if (isPalindrome(string)) {
            System.out.println("Chuỗi '" +string + "' " + " is a palindrome");
        } else {
            System.out.println("Chuỗi '" +string + "' " + " is not a palindrome");
        }
    }
}
