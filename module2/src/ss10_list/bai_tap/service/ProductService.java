package ss10_list.bai_tap.service;

import ss10_list.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Áo thun"));
        products.add(new Product(2, "Áo khoác"));
        products.add(new Product(3, "Quần tây"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void addProduct() {
        System.out.print("Enter product id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        products.add(new Product(id, name));
    }

    @Override
    public void updateProduct() {
        System.out.print("Nhập ID sản phầm cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        Product product = findProductById(id);
        if (product != null) {
            System.out.print("Nhập ID mới: ");
            int newID = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập tên mới: ");
            String newName = sc.nextLine();

            product.setName(newName);
            product.setId(newID);
            System.out.println("Đã cập nhật thành công !");
        } else {
            System.out.println("Không tìm thấy sản phẩm này !");
        }
    }

    @Override
    public void deleteProduct() {
        System.out.print("Nhập ID sản phầm cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        Product product = findProductById(id);
        if (product != null) {
            products.remove(product);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Không tìm thấy sản phẩm này!");
        }
    }

    private Product findProductById(int id) {
        for (Product product : products) {
            if (product != null && product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
