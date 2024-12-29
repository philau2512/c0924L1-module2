package ss12_map_set.thuc_hanh;

import ss11_stack.thuc_hanh.quan_ly_san_pham.model.Product;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<Product> productSet = new LinkedHashSet<>();
        productSet.add(new Product(1, "cà vạt"));
        productSet.add(new Product(2, "áo ba lỗ"));
        productSet.add(new Product(2, "áo ba lỗ"));
        productSet.add(new Product(3, "cà vạt3"));
        productSet.add(new Product(4, "cà vạt4"));

        //duyệt set dùng foreach
        for (Product product : productSet) {
            System.out.println(product);
        }
    }


}
