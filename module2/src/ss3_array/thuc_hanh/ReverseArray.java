package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the size of the array: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("The array is too large. (must < 20)");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.println("The array is: " + Arrays.toString(array));

        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[array.length - j - 1];
            array[array.length - j - 1] = temp;
        }
        System.out.println("The array after is: " + Arrays.toString(array));
    }
}
