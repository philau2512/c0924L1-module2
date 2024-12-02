package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class DemoMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng \n" +
                    "1. Xem danh sách \n" +
                    "2. Thêm mới \n" +
                    "3. Xóa \n" +
                    "4. Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // hiển thị danh sách
                    System.out.println("Hiển thị danh sách");
                    break;
                case 2:
                    // thêm mới
                    System.out.println("Thêm mới");
                    break;
                case 3:
                    System.out.println("Xóa");
                    break;
                case 4:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;
            }
        }
    }
}
