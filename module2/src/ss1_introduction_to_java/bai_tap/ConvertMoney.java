package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rate USD/VND: ");
        float rate = Float.parseFloat(sc.nextLine());

        System.out.println("Enter number of USD to convert: ");
        float value = Float.parseFloat(sc.nextLine());

        float converted = value * rate;
        System.out.println("Result: " + converted + " VND");
    }
}
