package ss11_stack.thuc_hanh.quan_ly_san_pham.service;

import ss11_stack.thuc_hanh.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void addProduct();
    void updateProduct();
    void deleteProduct();
}
