package ss11_stack.thuc_hanh.dao_nguoc;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng int ban đầu: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Mảng int sau khi đảo ngược: " + Arrays.toString(arr));

    }
}
