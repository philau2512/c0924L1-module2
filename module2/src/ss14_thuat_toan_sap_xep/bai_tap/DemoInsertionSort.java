package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class DemoInsertionSort {
    public static void insertionSort(int[] array) {
        int currentElement;
        int pos;

        for (int i = 1; i < array.length; i++) {
            boolean swapped  = false;
            currentElement = array[i];
            pos = i;
            System.out.println("Bắt đầu sort lần thứ : " + i);

            while (pos > 0 && array[pos-1] > currentElement) {
                array[pos] = array[pos-1];
                swapped = true;
                System.out.println("Dịch chuyển số: " + array[pos] + " tại index: " + pos);
                pos--;
            }

            if (!swapped) {
                System.out.println("Không dịch chuyển số nào cả !");
            }

            array[pos] = currentElement;
            System.out.println("Kết quả lần: " + i + " : " + Arrays.toString(array));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 7, 4};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        System.out.println();
        insertionSort(arr);
    }
}
