package ss19_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "Hello World 123, this is number 456.";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        // Duyệt qua tất cả các kết quả khớp
        boolean found = false; // Cờ kiểm tra có tìm thấy số hay không
        while (matcher.find()) {
            if (!found) {
                System.out.println("Số đầu tiên tìm thấy: " + matcher.group());
                found = true; // Đã in số đầu tiên
            } else {
                System.out.println("Số đã tìm thấy: " + matcher.group());
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy số nào trong chuỗi.");
        }
    }
}
