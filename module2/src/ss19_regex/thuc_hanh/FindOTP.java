package ss19_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOTP {
    public static void main(String[] args) {
        String text = "Your code : 61254848 - Code2: 146869";
        Pattern pattern = Pattern.compile("\\b\\d{6}\\b");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("Not found");
        }
    }
}
