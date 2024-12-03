package ss3_array.thuc_hanh;

public class CountChar {
    public static void main(String[] args) {
        String string = "hihihahakomondo";
        char charToCount = 'o';

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == charToCount) {
                count++;
            }
        }
        System.out.println("Ký tự '" + charToCount + "' xuất hiện " + count + " lần trong chuỗi.");
    }
}
