package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter the height: ");
        height = Float.parseFloat(scanner.nextLine());

        float area = width * height;
        System.out.println("Area is " + area);
    }
}
