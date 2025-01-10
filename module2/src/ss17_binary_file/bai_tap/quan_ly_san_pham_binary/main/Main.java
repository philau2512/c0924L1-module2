package ss17_binary_file.bai_tap.quan_ly_san_pham_binary.main;

import ss17_binary_file.bai_tap.quan_ly_san_pham_binary.controller.ProductController;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProductMenu();
    }
}
