package ss11_stack.bai_tap.thap_phan_sang_nhi_phan;

import java.util.Stack;

public class ConvertToBinary {
    public static Integer chuyenNhiPhan(int number) {
        int thuong = 1;
        Stack<Integer> stack = new Stack<>();

        while (thuong != 0) {
            thuong = number / 2;
            int phanDu = thuong % 2;
            stack.push(phanDu);
            number /= 2;
        }
        //System.out.println(stack);

        // Chuyển từ Stack thành số nguyên
        int binaryNumber = 0;
        int multiplier = 1; // Giá trị nhân (1, 10, 100, ...)

        while (!stack.isEmpty()) {
            binaryNumber += stack.pop() * multiplier;
            multiplier *= 10;
        }

        return binaryNumber;
    }

    public static void main(String[] args) {
        int number = 50;
        int maNhiPhan = chuyenNhiPhan(number);
        System.out.println("Mã nhị phân của " + number + " là: " + maNhiPhan);
    }
}
