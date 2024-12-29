package ss14_thuat_toan_sap_xep.thuc_hanh.demo_sort;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // Di chuyển qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
            // Tìm chỉ số của phần tử nhỏ nhất trong mảng từ i đến n
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Mảng trước khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);

        System.out.println("\nMảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

