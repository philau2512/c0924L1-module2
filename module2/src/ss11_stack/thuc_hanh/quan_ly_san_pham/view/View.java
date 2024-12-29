package ss11_stack.thuc_hanh.quan_ly_san_pham.view;

import ss11_stack.thuc_hanh.quan_ly_san_pham.controller.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProductMenu();
    }
}
