package ss3_array.thuc_hanh;

import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        String string[] = {"samsung", "huyndai" }; // ít dùng
        String[] string1 = new String[]{"samsung", "iphone" };
        Double[] numbers1 = new Double[3]; // chứa được 3 phần tử
        // mỗi ptu bên trong là giá trị mặc định
        System.out.println(numbers1[0]); // giá trị mặc định 0.0d

        System.out.println("-----------------in mảng------------------");
        System.out.println("mảng: " + numbers); // in ra địa chỉ ô nhớ [I@119d7047

        // Sử dụng class tiện ích để in ra giá trị
        System.out.println(Arrays.toString(numbers)); // [10, 20, 30]

        // duyệt mảng: for, for-each ( for of trong JS )
        System.out.println("-----------------duyệt mảng------------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + ":" + numbers[i]);
        }

        // sử dụng for - each
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
