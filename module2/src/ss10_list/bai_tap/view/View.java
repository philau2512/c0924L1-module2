package ss10_list.bai_tap.view;

import ss10_list.bai_tap.controller.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProductMenu();
    }
}
