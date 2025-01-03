package ss14_thuat_toan_sap_xep.thuc_hanh.demo_sort;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int currentElement = arr[i]; // Lấy phần tử hiện tại
            int j = i;

            // Di chuyển các phần tử lớn hơn `key` sang phải
            while (j > 0 && arr[j-1] > currentElement) {
                arr[j] = arr[j-1];
                j--;
            }
            // Chèn phần tử `currentElement` vào đúng vị trí
            arr[j] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11};
        System.out.println("Mảng trước khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("\nMảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

