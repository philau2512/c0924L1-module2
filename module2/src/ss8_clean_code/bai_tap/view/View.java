package ss8_clean_code.bai_tap.view;

import ss8_clean_code.bai_tap.controller.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProductMenu();
    }
}
