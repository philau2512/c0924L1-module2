package ss12_map_set.thuc_hanh;

import ss11_stack.thuc_hanh.quan_ly_san_pham.model.Product;

import java.util.*;

import java.util.HashSet;
import java.util.Set;
public class Demo2 {
    public static void main(String[] args) {
        Set<Product> productSet = new LinkedHashSet<>();
        Product product1 = new Product(1, "cà vạt");
        Product product11 = new Product(1, "cà vạt");
        Product product2 = new Product(2, "áo ba lỗ");
        Product product22 = new Product(2, "áo ba lỗ2");
        Product product3 = new Product(3, "cà vạt3");
        Product product4 = new Product(4, "cà vạt4");

        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product22);
        productSet.add(product3);
        productSet.add(product4);

        //duyệt set dùng foreach
        for (Product product : productSet) {
            System.out.println(product);
        }

        System.out.println("===============================================");

        Map<Product, Integer> productMap = new HashMap<>();
        productMap.put(product1, 1);
        productMap.put(product2, 2);
        productMap.put(product22, 5);
        productMap.put(product3, 3);
        productMap.put(product11, 40);
        //System.out.println(productMap.get(product1));
        Set<Product> productSet2 = productMap.keySet();
        for (Product product : productSet2) {
            System.out.println("San pham: " + product.getName() + "---" + productMap.get(product));
        }
    }
}
