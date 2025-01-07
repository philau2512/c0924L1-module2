package ss16_file.bai_tap.quan_ly_san_pham_ss16.controller;

import ss16_file.bai_tap.quan_ly_san_pham_ss16.model.Product;
import ss16_file.bai_tap.quan_ly_san_pham_ss16.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private ProductService productService = new ProductService();

    public void displayProductMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn chức năng: \n" +
                    "1. Xem toàn bộ sản phẩm\n" +
                    "2. Thêm sản phẩm mới\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Chỉnh sửa thông tin sản phẩm\n" +
                    "5. Sắp xếp sản phẩm theo ID\n" +
                    "6. Sắp xếp sản phẩm theo tên\n" +
                    "7. Thoát.");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách các sản phẩm");
                    List<Product> productsList = productService.getAllProduct();
                    for (Product product : productsList) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    System.out.print("Nhập id sản phẩm mới: ");
                    int newId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên sản phẩm mới: ");
                    String newName = scanner.nextLine();
                    productService.addProduct(new Product(newId, newName));
                    break;
                case 3:
                    System.out.print("Nhập id sản phẩm cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean isDeleted = productService.deleteProductById(deleteId);
                    if (isDeleted) {
                        System.out.println("✅ Xóa sản phẩm có id: " + deleteId + " thành công");
                    } else {
                        System.out.println("❌ Không tìm thấy sản phẩm có id: " + deleteId);
                    }
                    break;
                case 4:
                    System.out.print("Nhập id sản phẩm cần chỉnh sửa: ");
                    int idToUpdate = Integer.parseInt(scanner.nextLine());
                    boolean isUpdated = productService.updateProductById(idToUpdate);
                    if (isUpdated) {
                        System.out.println("✅ Cập nhật sản phẩm có id: " + idToUpdate + " thành công");
                    } else {
                        System.out.println("❌ Không tìm thấy sản phẩm có id: " + idToUpdate);
                    }
                    break;
                case 5:
                    productService.sortProductById();
                    break;
                case 6:
                    productService.sortProductByName();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
