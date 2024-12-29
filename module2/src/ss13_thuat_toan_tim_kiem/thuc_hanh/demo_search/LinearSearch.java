package ss13_thuat_toan_tim_kiem.thuc_hanh.demo_search;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Trả về chỉ số nếu tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại chỉ số " + result);
        } else {
            System.out.println("Phần tử " + target + " không tồn tại trong mảng.");
        }
    }
}

