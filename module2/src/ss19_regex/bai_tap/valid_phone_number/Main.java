package ss19_regex.bai_tap.valid_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Pattern pattern;
    static Matcher matcher;
    static final String REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public static boolean isValidPhoneNumber(String phoneNumber) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        for (String phoneNumber : phoneNumbers) {
            System.out.println("Phone number : " + phoneNumber + " - isValidPhoneNumber: " + isValidPhoneNumber(phoneNumber));
        }
    }
}
