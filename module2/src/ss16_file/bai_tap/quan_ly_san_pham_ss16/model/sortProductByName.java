package ss16_file.bai_tap.quan_ly_san_pham_ss16.model;

import java.util.Comparator;

public class sortProductByName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
