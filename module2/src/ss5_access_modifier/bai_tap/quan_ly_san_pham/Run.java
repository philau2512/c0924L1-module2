package ss5_access_modifier.bai_tap.quan_ly_san_pham;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nQuản lý sản phẩm:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.displayProducts();
                    break;
                case 3:
                    productManager.editProduct();
                    break;
                case 4:
                    productManager.deleteProduct();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
}
