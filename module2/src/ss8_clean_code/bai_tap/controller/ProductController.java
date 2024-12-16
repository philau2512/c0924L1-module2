package ss8_clean_code.bai_tap.controller;

import ss5_access_modifier.bai_tap.class_only_write.Student;
import ss8_clean_code.bai_tap.model.Product;
import ss8_clean_code.bai_tap.service.ProductService;

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
                    Product[] products = productService.findAll();
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
