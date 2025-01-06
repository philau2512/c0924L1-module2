package ss12_map_set.bai_tap.quan_ly_san_pham.by_arraylist.model;

import java.util.Comparator;

public class sortProductByName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
