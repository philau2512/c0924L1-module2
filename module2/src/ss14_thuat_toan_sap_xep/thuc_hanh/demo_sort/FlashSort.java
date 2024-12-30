package ss14_thuat_toan_sap_xep.thuc_hanh.demo_sort;

import java.util.Arrays;

public class FlashSort {
    public static void flashSort(int[] array) {
        int n = array.length;
        if (n <= 1) return;

        // Bước 1: Tìm giá trị nhỏ nhất và lớn nhất trong mảng
        int min = array[0], maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > array[maxIndex]) maxIndex = i;
            if (array[i] < min) min = array[i];
        }

        // Kiểm tra xem mảng có cần sắp xếp không
        if (array[maxIndex] == min) return;

        // Bước 2: Tạo và tính các lớp (buckets)
        int m = (int) (0.45 * n); // Số lớp
        int[] l = new int[m];
        double c1 = (double) (m - 1) / (array[maxIndex] - min);

        for (int i = 0; i < n; i++) {
            int k = (int) ((array[i] - min) * c1);
            l[k]++;
        }

        // Tích lũy các lớp
        for (int i = 1; i < m; i++) {
            l[i] += l[i - 1];
        }

        // Bước 3: Phân phối lại các phần tử vào đúng vị trí
        int move = 0, j = 0, k = m - 1;
        while (move < n) {
            while (j >= l[k]) {
                j++;
                if (j >= n) break;
                k = (int) ((array[j] - min) * c1);
            }
            if (j >= n) break;

            int flash = array[j];
            while (j < l[k]) {
                k = (int) ((flash - min) * c1);
                int temp = array[--l[k]];
                array[l[k]] = flash;
                flash = temp;
                move++;
            }
        }

        // Bước 4: Sử dụng sắp xếp chèn cho từng lớp
        for (k = 0; k < m; k++) {
            int start = (k == 0) ? 0 : l[k - 1];
            int end = l[k];
            for (int i = start + 1; i < end; i++) {
                int temp = array[i];
                int j2 = i - 1;
                while (j2 >= start && array[j2] > temp) {
                    array[j2 + 1] = array[j2];
                    j2--;
                }
                array[j2 + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 3, 2, 5, 7, 6, 4, 9, 1, 8};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        flashSort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
    }
}