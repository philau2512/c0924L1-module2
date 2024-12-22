package ss10_list.thuc_hanh.simple_list;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + (i+1) + " : " + list.get(i));
        }
    }
}
