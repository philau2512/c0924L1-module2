package ss12_map_set.bai_tap.quan_ly_san_pham.by_arraylist.service;

import ss12_map_set.bai_tap.quan_ly_san_pham.by_arraylist.model.Product;

public interface IProductService {
    void getAllProduct();

    void addProduct(Product product);

    void deleteProduct(Product product);

    void updateProduct(int id, String newName);

    Product getProductById(int id);

    void sortProductById();

    void sortProductByName();
}
