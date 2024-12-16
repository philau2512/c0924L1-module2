package ss8_clean_code.bai_tap.service;
import ss8_clean_code.bai_tap.model.Product;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    private static Product[] products = new Product[10];

    static {
        products[0] = new Product(1, "Áo thun");
        products[1] = new Product(2, "Áo khoác");
        products[2] = new Product(3, "Quần tây");
    }

    @Override
    public Product[] findAll() {
        return products;
    }

    @Override
    public void addProduct() {
        System.out.print("Enter product id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        Product product = new Product(id, name);

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
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
            for (int i = 0; i < products.length; i++) {
                if (products[i] == product) {
                    products[i] = null;
                }
            }
            System.out.println("Đã xóa sản phẩm thành công !");
        } else {
            System.out.println("Không tìm thấy sản phẩm này !");
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
