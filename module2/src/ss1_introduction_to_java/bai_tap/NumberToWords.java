import java.util.Scanner; // code bởi chatGPT hehe ( xem tham khảo )

public class NumberToWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên không âm có tối đa 3 chữ số: ");
        int num = sc.nextInt();

        if (num < 0 || num > 999) {
            System.out.println("Out of ability");
        } else {
            System.out.println(numberToWords(num));
        }
    }

    public static String numberToWords(int num) {
        if (num == 0) {
            return "zero";
        }

        String result = "";

        if (num >= 100) {
            result += ones(num / 100) + " hundred";
            num %= 100;
            if (num > 0) {
                result += " and ";
            }
        }

        if (num >= 20) {
            result += tens(num / 10);
            num %= 10;
            if (num > 0) {
                result += " " + ones(num);
            }
        } else if (num >= 10) {
            result += teens(num);
        } else if (num > 0) {
            result += ones(num);
        }

        return result;
    }

    public static String ones(int num) {
        return switch (num) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "";
        };
    }

    public static String teens(int num) {
        return switch (num) {
            case 10 -> "ten";
            case 11 -> "eleven";
            case 12 -> "twelve";
            case 13 -> "thirteen";
            case 14 -> "fourteen";
            case 15 -> "fifteen";
            case 16 -> "sixteen";
            case 17 -> "seventeen";
            case 18 -> "eighteen";
            case 19 -> "nineteen";
            default -> "";
        };
    }

    public static String tens(int num) {
        return switch (num) {
            case 2 -> "twenty";
            case 3 -> "thirty";
            case 4 -> "forty";
            case 5 -> "fifty";
            case 6 -> "sixty";
            case 7 -> "seventy";
            case 8 -> "eighty";
            case 9 -> "ninety";
            default -> "";
        };
    }
}