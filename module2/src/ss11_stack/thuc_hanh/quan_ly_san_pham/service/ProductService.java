package ss11_stack.thuc_hanh.quan_ly_san_pham.service;

import ss11_stack.thuc_hanh.quan_ly_san_pham.model.CompareByIdAndName;
import ss11_stack.thuc_hanh.quan_ly_san_pham.model.Product;

import java.util.*;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(2, "Dây nịt"));
        products.add(new Product(2, "ADây nịt"));
        products.add(new Product(3, "Bao tay"));
        products.add(new Product(1, "Quần tây"));
        products.add(new Product(4, "Áo thun"));
    }

    @Override
    public List<Product> findAll() {
        Collections.sort(products, new CompareByIdAndName());
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
