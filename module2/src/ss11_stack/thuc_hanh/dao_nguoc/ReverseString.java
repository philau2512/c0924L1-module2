package ss11_stack.thuc_hanh.dao_nguoc;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str) {
        Stack<String> wStack = new Stack<>();
        String[] words = str.split(" ");

        for (String word : words) {
            wStack.push(word);
        }

        StringBuilder sb = new StringBuilder();
        while (!wStack.isEmpty()) {
            sb.append(wStack.pop());
            if (!wStack.isEmpty()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Trước: " + str);
        String output = reverseString(str);
        System.out.println("Sau: " + output);
    }
}
