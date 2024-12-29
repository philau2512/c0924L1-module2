package ss13_thuat_toan_tim_kiem.thuc_hanh.demo_search;

public class BinarySearch {
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = low + (high - low) / 2; // Tránh tràn số

            if (key < list[mid]) {
                high = mid - 1; // Giảm phạm vi tìm kiếm
            } else if (key == list[mid]) {
                return mid; // Tìm thấy key
            } else {
                low = mid + 1; // Tăng phạm vi tìm kiếm
            }
        }

        return -1; // Không tìm thấy key
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại chỉ số " + result);
        } else {
            System.out.println("Phần tử " + target + " không tồn tại trong mảng.");
        }
    }
}

