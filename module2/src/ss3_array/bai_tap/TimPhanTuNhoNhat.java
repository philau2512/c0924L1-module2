package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.println("Nhập size của mảng: ");
            size = Integer.parseInt(sc.nextLine());
        } while (size > 20);

        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }

        System.out.println("Mảng vừa nhâp là: " + Arrays.toString(array));
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);
    }
}
