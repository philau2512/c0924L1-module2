package ss16_file.bai_tap.quan_ly_san_pham_ss16.model;

import java.util.Comparator;
import java.util.List;

public class sortProductById implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getId() == o2.getId()){
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getId() - o2.getId();
        }
    }
}
