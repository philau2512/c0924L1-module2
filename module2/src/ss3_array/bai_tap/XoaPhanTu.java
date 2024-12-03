package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng phần tử mảng: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.println("Size must < 20");
            }
        } while (size > 20);

        arr = new int[size];
        int k = 0;
        while (k < size) {
            System.out.print("Enter element: " + (k + 1) + " :");
            arr[k] = Integer.parseInt(sc.nextLine());
            k++;
        }

        int input_value;
        System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));

        System.out.print("Nhập phần tử cần xóa: ");
        input_value = Integer.parseInt(sc.nextLine());

        boolean isExist = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (input_value == arr[i]) {
                isExist = true;
                index = i;
                break;
            }
        }
        if (isExist) {
            for (int j = index; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = 0;
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(arr));
        } else {
            System.out.println("Phần tử : " + input_value + " không tìm thấy !");
        }
    }
}
