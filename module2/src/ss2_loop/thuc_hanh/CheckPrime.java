package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int n = Integer.parseInt(sc.nextLine());

        if (n < 2) {
            System.out.println(n + " không phải số nguyên tố !");
        } else {
            int i = 2;
            boolean flag = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag) {
                System.out.println(n + " là số nguyên tố !");
            } else {
                System.out.println(n + " không là số nguyên tố !");
            }
        }
    }
}
