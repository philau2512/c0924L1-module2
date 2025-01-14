package ss19_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    static Pattern pattern;
    static Matcher matcher;
    static final String EMAIL_REGEX = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
    static final String EMAIL_REGEX_2 = "^[a-zA-Z0-9_]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})$";

    public static void main(String[] args) {
        String email1 = "a@gmail.com";
        String email2 = "aa@yahoo.com";
        String email3 = "@#abc@gmail.com";
        String email4 = "ab@gmail.";
        String email5 = "@gmail.com";

        boolean check1 = validateEmail(email1);
        boolean check2 = validateEmail(email2);
        boolean check3 = validateEmail(email3);
        boolean check4 = validateEmail(email4);
        boolean check5 = validateEmail(email5);

        System.out.println("email1: " + email1 + " - isValid: " + check1);
        System.out.println("email2: " + email2 + " - isValid: " + check2);
        System.out.println("email3: " + email3 + " - isValid: " + check3);
        System.out.println("email4: " + email4 + " - isValid: " + check4);
        System.out.println("email5: " + email5 + " - isValid: " + check5);
    }

    public static boolean validateEmail(String email) {
        pattern = Pattern.compile(EMAIL_REGEX_2);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
