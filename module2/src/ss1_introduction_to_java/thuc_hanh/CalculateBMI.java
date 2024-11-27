package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Nhập cân nặng (kg): ");
        weight = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập chiều cao (m): ");
        height = Double.parseDouble(scanner.nextLine());

        bmi = weight / Math.pow(height, 2);
        if (bmi < 18) {
            System.out.println(bmi + " - Underweight");
        } else if (bmi < 25.0) {
            System.out.println(bmi + " - Normal");
        } else if (bmi < 30.0) {
            System.out.println(bmi + " - Overweight");
        } else {
            System.out.println(bmi + " - Obese");
        }
    }
}
