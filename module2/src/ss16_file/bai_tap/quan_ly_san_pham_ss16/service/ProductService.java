package ss16_file.bai_tap.quan_ly_san_pham_ss16.service;

import ss16_file.bai_tap.quan_ly_san_pham_ss16.model.Product;
import ss16_file.bai_tap.quan_ly_san_pham_ss16.model.sortProductById;
import ss16_file.bai_tap.quan_ly_san_pham_ss16.model.sortProductByName;
import ss16_file.bai_tap.quan_ly_san_pham_ss16.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final String PRODUCTS_FILE = "src/ss16_file/bai_tap/quan_ly_san_pham_ss16/data/products.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    private static List<Product> productsList = new ArrayList<>();

    @Override
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        // đọc file và chuyển dữ liệu sang productsList
        List<String> productStringList = ReadAndWriteFile.ReadFile(PRODUCTS_FILE);
        for (String productString : productStringList) {
            String[] productArray = productString.split(",");
            products.add(new Product(Integer.parseInt(productArray[0]), productArray[1]));
        }
        return products;
    }

    @Override
    public void addProduct(Product product) {
        List<String> productStringList = new ArrayList<>();
        productStringList.add(product.getInfoProduct());
        ReadAndWriteFile.WriteFile(PRODUCTS_FILE, productStringList, APPEND);
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
            List<String> productStringList = new ArrayList<>();
            for (Product product : productsList) {
                productStringList.add(product.getInfoProduct());
            }
            ReadAndWriteFile.WriteFile(PRODUCTS_FILE, productStringList, NOT_APPEND);
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
            List<String> productStringList = new ArrayList<>();
            for (Product product : productsList) {
                productStringList.add(product.getInfoProduct());
            }
            ReadAndWriteFile.WriteFile(PRODUCTS_FILE, productStringList, NOT_APPEND);
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
