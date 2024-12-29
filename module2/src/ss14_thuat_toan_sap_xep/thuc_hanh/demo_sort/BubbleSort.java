package ss14_thuat_toan_sap_xep.thuc_hanh.demo_sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Lặp qua các phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
            // Biến kiểm tra nếu không có hoán đổi nào
            boolean swapped = false;
            // So sánh từng cặp phần tử liền kề
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi nếu phần tử không theo thứ tự
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Nếu không có hoán đổi nào trong vòng lặp, thoát ra sớm
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Mảng trước khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);

        System.out.println("\nMảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

