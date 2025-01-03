package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập a: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập b: ");
            int b = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập c: ");
            int c = Integer.parseInt(sc.nextLine());

            boolean valid = validCheck(a, b, c);
            if (valid) {
                System.out.println("Ba cạnh hợp lệ.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Lỗi NumberFormatException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi cạnh tam giác: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi khác: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static boolean validCheck(int a, int b, int c) throws IllegalArgumentException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Không hợp lệ - Độ dài không được là số âm.");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalArgumentException("Không hợp lệ - Tổng 2 cạnh không lớn hơn cạnh thứ 3.");
        }
        return true;
    }
}
