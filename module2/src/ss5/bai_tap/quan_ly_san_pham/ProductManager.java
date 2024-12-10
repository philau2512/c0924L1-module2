package ss5.bai_tap.quan_ly_san_pham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> products = new ArrayList<>(); // khai báo và khởi tạo 1 danh sách (List) các đối tượng Product
    Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Enter product id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter product price: ");
        double price = Double.parseDouble(sc.nextLine());

        Product product = new Product(id, name, price);
        products.add(product);
        System.out.println("Sản phẩm đã được thêm thành công.");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào !");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void editProduct() {
        System.out.print("Nhập ID sản phẩm cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        Product product = getProductById(id);
        if (product != null) {
            System.out.print("Nhập tên mới của sản phẩm: ");
            String newName = sc.nextLine();
            System.out.print("Nhập giá mới của sản phẩm: ");
            double newPrice = Double.parseDouble(sc.nextLine());

            product.setName(newName);
            product.setPrice(newPrice);
            System.out.println("Đã cập nhật thành công !");
        } else {
            System.out.println("Không tìm thấy sản phẩm này !");
        }
    }

    public void deleteProduct() {
        System.out.print("Nhập ID sản phầm cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        Product product = getProductById(id);
        if (product != null) {
            products.remove(product);
            System.out.println("Đã xóa sản phẩm thành công !");
        } else {
            System.out.println("Không tìm thấy sản phẩm này !");
        }
    }

    private Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}
