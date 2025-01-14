package ss19_regex.bai_tap.valid_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Pattern pattern;
    static Matcher matcher;
    static final String REGEX = "^[CAP][0-9]{4}[GHIK]$";

    public static boolean isValid(String input) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] classArray = {"C0223G", "A0323K", "M0318G", "P0323A"};
        for (String className : classArray) {
            System.out.println("Lớp : " + className + " - isValid : " + isValid(className));
        }
    }
}
