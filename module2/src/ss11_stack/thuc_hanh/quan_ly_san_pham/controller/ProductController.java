package ss11_stack.thuc_hanh.quan_ly_san_pham.controller;

import ss11_stack.thuc_hanh.quan_ly_san_pham.model.Product;
import ss11_stack.thuc_hanh.quan_ly_san_pham.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private ProductService productService = new ProductService();

    public void displayProductMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn chức năng: \n" +
                    "1. Xem danh sách sản phẩm\n" +
                    "2. Thêm sản phẩm\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Chỉnh sửa sản phẩm\n" +
                    "5. Thoát");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    List<Product> products = productService.findAll();
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 4:
                    productService.updateProduct();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
