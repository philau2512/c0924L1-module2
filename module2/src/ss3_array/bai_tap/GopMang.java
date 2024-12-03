package ss3_array.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {2, 6, 5, 4, 3};
        int[] array2 = {11, 52, 99};

        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        // System.arraycopy(array2, 0, array3, array1.length + 0, array2.length);
        System.out.println("Mảng sau khi gộp: " + Arrays.toString(array3));
    }
}
