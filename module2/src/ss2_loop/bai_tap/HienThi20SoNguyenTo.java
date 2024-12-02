package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in: ");
        n = Integer.parseInt(sc.nextLine());
        int count = 0;
        int N = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println("Số nguyên tố thứ " + count + " là: " + N);
            }
            N++;
        }
    }
}
