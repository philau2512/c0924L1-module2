package ss2_loop.bai_tap;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn chức năng\n" +
                    "1. Vẽ hình chữ nhật\n" +
                    "2. Vẽ tam giác vuông (botton-left)\n" +
                    "3. Vẽ tam giác vuông (top-left)\n" +
                    "4. Vẽ tam giác cân\n" +
                    "5. Thoát chương trình !\n");
            int choice = Integer.parseInt(sc.nextLine());
            int n;
            switch (choice) {
                case 1:
                    System.out.println("---------------Vẽ hình chữ nhật---------------");
                    int chieuDai;
                    int chieuRong;
                    System.out.print("Nhâp chiều dài: ");
                    chieuDai = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập chiều rộng: ");
                    chieuRong = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < chieuRong; i++) {
                        for (int j = 0; j < chieuDai; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("---------------Vẽ tam giác vuông (botton-left)---------------");
                    System.out.print("Nhập chiều cao tam giác: ");
                    n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("---------------Vẽ tam giác vuông (top-left)---------------");
                    System.out.print("Nhập chiều cao tam giác: ");
                    n = Integer.parseInt(sc.nextLine());

                    for (int i = n; i >= 1; i--) {
                        for (int j = i; j >= 1; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("---------------Vẽ tam giác cân---------------");
                    System.out.print("Nhập chiều cao tam giác: ");
                    n = Integer.parseInt(sc.nextLine());

                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice !");
                    break;
            }
        }
    }
}
