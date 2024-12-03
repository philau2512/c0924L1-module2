package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
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

        System.out.print("Nhập vị trí cần chèn: ");
        int X = Integer.parseInt(sc.nextLine());

        if (X <= -1 || X >= size - 1) {
            System.out.println("Can not insert to this index.");
        } else {
            System.out.print("Nhập giá trị cần chèn: ");
            int input = Integer.parseInt(sc.nextLine());

            int[] newArray = new int[size + 1];
            System.arraycopy(array, 0, newArray, 0, X);
            newArray[X] = input;

            for (int k = X; k < newArray.length - 1; k++) {
                newArray[k + 1] = array[k];
            }
            System.out.println("The array after is: " + Arrays.toString(newArray));
        }
    }
}
