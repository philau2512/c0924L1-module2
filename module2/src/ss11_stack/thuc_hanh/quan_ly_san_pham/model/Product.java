package ss11_stack.thuc_hanh.quan_ly_san_pham.model;

import ss7_interface_abstract_class.bai_tap.colorable.Colorable;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Product product = (Product) o;
        return this.id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public int compareTo(Product o) {

        if (this.getId() - o.getId() == 0) {
            // sắp xếp theo tên
            return this.getName().compareTo(o.getName());
        } else {
            return this.getId() - o.getId();
        }

        // nhanh gọn
        // return this.getId() - o.getId();
    }
}
