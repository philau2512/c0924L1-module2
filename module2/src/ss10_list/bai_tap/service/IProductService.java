package ss10_list.bai_tap.service;

import ss10_list.bai_tap.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void addProduct();
    void updateProduct();
    void deleteProduct();
}
