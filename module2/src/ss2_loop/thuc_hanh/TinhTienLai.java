package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money;
        int month;
        double rate;
        System.out.println("Nhập số tiền cho vay: ");
        money = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập số tháng: ");
        month = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập lãi suất mỗi năm (%): ");
        rate = Double.parseDouble(sc.nextLine());

        double TongLai = 0;
        for (int i = 0; i < month; i++) {
            TongLai += money * (rate / 100) / 12 * month;
        }
        System.out.println("Tổng tiền lãi là: " + TongLai);
    }
}
