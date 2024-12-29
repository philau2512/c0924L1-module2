package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Nhập chuỗi: ");
//        String string = input.nextLine();
        String string = "abcabcdgabmnsxy";

        LinkedList<Character> max = new LinkedList<>(); // kết quả cuối
        LinkedList<Character> listTemp = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            if (listTemp.size() > 1 && string.charAt(i) <= listTemp.getLast() && listTemp.contains(string.charAt(i))) {
                listTemp.clear();
            }

            listTemp.add(string.charAt(i));

            if (listTemp.size() > max.size()) {
                max.clear();
                max.addAll(listTemp);
            }
        }

        for (Character c : max) {
            System.out.print(c);
        }

        System.out.println();
    }
}
