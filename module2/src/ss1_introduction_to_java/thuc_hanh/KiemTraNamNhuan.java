package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra: ");
        int year = Integer.parseInt(scanner.nextLine());

        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            System.out.printf("%d là 1 năm nhuận !", year);
        } else {
            System.out.println(year + " không là năm nhuận !");
        }
    }
}
