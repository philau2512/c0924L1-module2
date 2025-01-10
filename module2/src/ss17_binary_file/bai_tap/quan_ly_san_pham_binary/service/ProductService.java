package ss17_binary_file.bai_tap.quan_ly_san_pham_binary.service;

import ss17_binary_file.bai_tap.quan_ly_san_pham_binary.model.Product;
import ss17_binary_file.bai_tap.quan_ly_san_pham_binary.model.sortProductById;
import ss17_binary_file.bai_tap.quan_ly_san_pham_binary.model.sortProductByName;
import ss17_binary_file.bai_tap.quan_ly_san_pham_binary.util.ReadAndWriteBinaryFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final String PRODUCTS_FILE = "src/ss17_binary_file/bai_tap/quan_ly_san_pham_binary/data/products.dat";

    private static List<Product> productsList = new ArrayList<>();

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = null;
        try {
            productList = ReadAndWriteBinaryFile.readListObjectFromDat(PRODUCTS_FILE);
        } catch (IOException e) {
            System.out.println("Lỗi khi hiển thị toàn bộ sản phẩm: " + e.getMessage());
        }
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<Product> productList = null;
        try {
            productList = ReadAndWriteBinaryFile.readListObjectFromDat(PRODUCTS_FILE);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc nội dung file sản phẩm: " + e.getMessage());
        }
        productList.add(product);
        ReadAndWriteBinaryFile.writeListObjectToDat(PRODUCTS_FILE, productList);
    }

    @Override
    public boolean deleteProductById(int id) {
        List<Product> productsList = getAllProduct();
        boolean isExist = false;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == id) {
                isExist = true;
                productsList.remove(i);
                break;
            }
        }
        if (isExist) {
            ReadAndWriteBinaryFile.writeListObjectToDat(PRODUCTS_FILE, productsList);
        }
        return isExist;
    }

    @Override
    public boolean updateProductById(int id) {
        List<Product> productsList = getAllProduct();
        boolean isUpdate = false;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == id) {
                System.out.println("Sản phẩm cần update: " + productsList.get(i));
                productsList.remove(i);
                Scanner sc = new Scanner(System.in);
                int newId;
                String newName;
                System.out.print("Bạn có muốn đổi id sản phẩm này không? (y/n): ");
                String isChangeId = sc.nextLine();
                if (isChangeId.equals("y")) {
                    System.out.print("Nhập id mới: ");
                    newId = Integer.parseInt(sc.nextLine());
                } else {
                    newId = id;
                }
                System.out.print("Nhập tên mới cho sản phẩm: ");
                newName = sc.nextLine();
                //productsList.add(new Product(newId, newName));
                productsList.add(i, new Product(newId, newName));
                isUpdate = true;
                break;
            }
        }
        if (isUpdate) {
            ReadAndWriteBinaryFile.writeListObjectToDat(PRODUCTS_FILE, productsList);
        }
        return isUpdate;
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
        List<Product> productsList = getAllProduct();
        Collections.sort(productsList, new sortProductById());
        System.out.println("Danh sách sản phẩm theo id: ");
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

    @Override
    public void sortProductByName() {
        List<Product> productsList = getAllProduct();
        Collections.sort(productsList, new sortProductByName());
        System.out.println("Danh sách sản phẩm theo tên: ");
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

}
