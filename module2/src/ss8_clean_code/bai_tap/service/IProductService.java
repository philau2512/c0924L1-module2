package ss8_clean_code.bai_tap.service;

import ss8_clean_code.bai_tap.model.Product;

public interface IProductService {
    Product[] findAll();
    void addProduct();
    void updateProduct();
    void deleteProduct();
}
