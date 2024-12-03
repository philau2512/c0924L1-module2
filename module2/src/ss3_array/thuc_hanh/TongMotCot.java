package ss3_array.thuc_hanh;

import java.util.Scanner;

public class TongMotCot {
    public static void main(String[] args) {
        // Khởi tạo mảng 2 chiều có sẵn các giá trị thực
        double[][] array = {
                {1.2, 2.5, 3.1},
                {4.5, 5.8, 6.9},
                {7.4, 8.1, 9.3},
                {10.0, 11.2, 12.5}
        };

        System.out.println("Mảng 2 chiều:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thứ tự cột (tính từ 0): ");
        int columnIndex = scanner.nextInt();

        if (columnIndex < 0 || columnIndex >= array[0].length) {
            System.out.println("Cột không hợp lệ!");
        } else {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][columnIndex];
            }

            System.out.println("Tổng các phần tử của cột " + columnIndex + " là: " + sum);
        }
    }
}

