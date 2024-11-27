package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SolvePhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất !");
        System.out.println("Cho phương trình 'a * x + b = c', hãy nhập hằng số:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số b: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số c: ");
        double c = Double.parseDouble(sc.nextLine());

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("x là: " + answer);
        } else if (b == c) {
            System.out.println("Phương trình vô số nghiệm");
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
