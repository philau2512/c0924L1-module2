package ss12_map_set.bai_tap.quan_ly_san_pham.by_arraylist.service;

import ss12_map_set.bai_tap.quan_ly_san_pham.by_arraylist.model.Product;
import ss12_map_set.bai_tap.quan_ly_san_pham.by_arraylist.model.sortProductById;
import ss12_map_set.bai_tap.quan_ly_san_pham.by_arraylist.model.sortProductByName;

import java.util.*;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    private static List<Product> productsList = new ArrayList<>();

    static {
        productsList.add(new Product(1, "Bàn chảy"));
        productsList.add(new Product(3, "Kem đánh răng"));
        productsList.add(new Product(4, "Ao thun"));
        productsList.add(new Product(2, "Túi Xách"));
    }

    @Override
    public void getAllProduct() {
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct(Product product) {
        productsList.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productsList.remove(product);
    }

    @Override
    public void updateProduct(int id, String newName) {
        for (Product product : productsList) {
            if (product.getId() == id) {
                product.setName(newName); // Giả sử Product có phương thức setName()
                System.out.println("✅ Cập nhật sản phẩm có id: " + id + " thành công");
                return;
            }
        }
    }

    @Override
    public Product getProductById(int id) {
        for (Product product : productsList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void sortProductById() {
        Collections.sort(productsList, new sortProductById());
    }

    @Override
    public void sortProductByName() {
        Collections.sort(productsList, new sortProductByName());
    }
}
