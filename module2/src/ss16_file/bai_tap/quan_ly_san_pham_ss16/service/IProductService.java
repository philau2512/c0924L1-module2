package ss16_file.bai_tap.quan_ly_san_pham_ss16.service;

import ss16_file.bai_tap.quan_ly_san_pham_ss16.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProduct();

    void addProduct(Product product);

    boolean deleteProductById(int id);

    boolean updateProductById(int id);

    Product getProductById(int id);

    void sortProductById();

    void sortProductByName();
}
