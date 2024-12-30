package ss11_stack.thuc_hanh.thap_phan_sang_nhi_phan;

import java.util.Stack;

public class ConvertToBinary {
    public static String convertToBinary(int num) {
        if (num == 0) return "0"; // Trường hợp đặc biệt: số 0

        Stack<Integer> stack = new Stack<>();

        // Chuyển đổi sang nhị phân
        while (num > 0) {
            int phanDu = num % 2; // Tính phần dư
            stack.push(phanDu);   // Đưa phần dư (0 hoặc 1) vào stack
            num = num / 2;        // Cập nhật num bằng thương
        }

        // Xây dựng chuỗi nhị phân từ stack
        StringBuilder binaryNumber = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryNumber.append(stack.pop()); // Nối từng phần tử trong stack vào chuỗi
        }

        return binaryNumber.toString();
    }

    public static void main(String[] args) {
        int decimal = 30;
        String binary = convertToBinary(decimal);
        System.out.println("Số nhị phân của " + decimal + " là: " + binary);
    }
}
