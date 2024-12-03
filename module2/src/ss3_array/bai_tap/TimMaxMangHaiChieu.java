package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

// Viết một ứng dụng cho phép người dùng nhập vào một ma trận số thực, sau đó tìm ra tọa độ cũng như giá trị của phần tử lớn nhất.
public class TimMaxMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // B1. Khởi tạo mảng 2 chiều
        int numCol;
        int numRow;
        System.out.print("Enter the row number: ");
        numRow = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the column number: ");
        numCol = Integer.parseInt(sc.nextLine());

        System.out.println("Create matrix with " + numRow + " rows and " + numCol + " columns");
        int[][] matrix = new int[numRow][numCol];

        // B2. Nhập giá trị vào mảng
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Nhập giá trị tại vị trí " + i + "-" + j + " : ");
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println();
        System.out.println("Matrix is: " + Arrays.deepToString(matrix));

        // B3. Tìm giá trị lớn nhất trong mảng 2 chiều:
        int max = matrix[0][0];
        int indexCol = 0;
        int indexRow = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Max value in array is: " + max + " at index: " + indexRow + "-" + indexCol);
    }
}
