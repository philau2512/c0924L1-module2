package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng phần tử mảng: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Size must < 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element: " + (i + 1) + " :");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.println("Array is: " + Arrays.toString(array));

        int index = findMin(array);
        System.out.println("Min value is: " + array[index]);
    }

    public static int findMin(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
