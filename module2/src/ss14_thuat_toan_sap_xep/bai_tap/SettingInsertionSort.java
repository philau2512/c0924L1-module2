package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class SettingInsertionSort {
    public static void insertionSort(int[] array) {
        int pos;
        int currentElement;

        for (int i = 1; i < array.length; i++) {
            currentElement = array[i];
            pos = i;
            while (pos > 0 && array[pos - 1] > currentElement) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = currentElement;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {15, 22, 5, 6, 2, 4, 68};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Mảng sau khi sort: " + Arrays.toString(array));
    }
}
