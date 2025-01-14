package ss19_regex.thuc_hanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidAccount {
    static Pattern pattern;
    static Matcher matcher;
    static final String REGEX = "^[a-zA-Z0-9_-]{6,}$";

    public static boolean validAccount(String account) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(account);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        String account = sc.nextLine();
        //String account = "123456789";
        System.out.println("Account: " + account + " - isValid : " + validAccount(account));
    }
}
