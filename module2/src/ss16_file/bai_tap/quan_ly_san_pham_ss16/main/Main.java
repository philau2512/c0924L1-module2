package ss16_file.bai_tap.quan_ly_san_pham_ss16.main;

import ss16_file.bai_tap.quan_ly_san_pham_ss16.controller.ProductController;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProductMenu();
    }
}
