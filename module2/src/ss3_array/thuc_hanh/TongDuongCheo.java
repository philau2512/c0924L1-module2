package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        // Khởi tạo mảng 2 chiều có sẵn các giá trị thực
        double[][] array = {
                {1, 2, 4},
                {4, 5, 6},
                {9, 8, 15}
        };

        System.out.println("Mảng 2 chiều:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }

        System.out.println("Tổng các đường chéo: " + sum);
    }
}

