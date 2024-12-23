package ss11_stack.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int num : array) {
            stack.push(num);
        }
        //System.out.println("Mảng stack: " + stack);
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static String reverseString(String input) {
        Stack<String> wStack = new Stack<>();
        String[] words = input.split(" ");
        for (String word : words) {
            wStack.push(word);
        }
        //System.out.println("wStack = " + wStack);
        StringBuilder output = new StringBuilder();
        while (!wStack.isEmpty()) {
            output.append(wStack.pop());
            if (!wStack.isEmpty()) {
                output.append(" ");
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Mảng số ban đầu là: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Mảng số sau khi đảo ngược: " + Arrays.toString(array));

        String input = "Hello world this is Java";
        System.out.println("Mảng chuỗi ban đầu: " + input);
        String reversed = reverseString(input);
        System.out.println("Mảng chuỗi đảo ngược: " + reversed);
    }
}
