package ss11_stack.thuc_hanh.quan_ly_san_pham.model;

import java.util.Comparator;

public class CompareByIdAndName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getId() == o2.getId()){
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getId() - o2.getId();
        }
    }
}
