package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>(); // kết quả cuối

        // Tìm chuỗi tăng dần có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> listTemp = new LinkedList<>(); // Chuỗi tạm thời
            listTemp.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > listTemp.getLast()) { // So sánh ký tự tiếp theo
                    listTemp.add(string.charAt(j));
                }
            }

            // Cập nhật chuỗi kết quả nếu chuỗi tạm dài hơn
            if (listTemp.size() > max.size()) {
                max.clear();
                max.addAll(listTemp);
            }
        }

        // Hiển thị chuỗi tăng dần dài nhất
        System.out.print("Chuỗi tăng dần dài nhất: ");
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
