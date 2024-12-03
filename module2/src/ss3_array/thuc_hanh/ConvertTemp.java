package ss3_array.thuc_hanh;

import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn chức năng: \n" +
                "1. Fahrenheit to Celsius\n" +
                "2. Celsius to Fahrenheit\n" +
                "0. Exit\n");
        int choice = Integer.parseInt(sc.nextLine());
        double fahrenheit;
        double celsius;

        switch (choice) {
            case 1:
                System.out.println("Fahrenheit to Celsius");
                System.out.print("Enter fahrenheit: ");
                fahrenheit = Double.parseDouble(sc.nextLine());
                System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("Celsius to Fahrenheit");
                System.out.print("Enter Celsius: ");
                celsius = Double.parseDouble(sc.nextLine());
                System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            case 0:
                System.out.println("Exit");
                System.exit(0);
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
