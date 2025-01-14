package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.Truck;

import java.util.Scanner;

public class VehicleService {
    Scanner scanner = new Scanner(System.in);

    public void addTruck() {
        System.out.print("Nhập biển kiểm soát: ");
        String licensePlate = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Nhập trọng tải: ");
        double capacity = Double.parseDouble(scanner.nextLine());

        Truck newTruck = new Truck(licensePlate, manufacturer, yearOfManufacture, owner, capacity);

    }

    public void addCar() {

    }

    public void addMotorbike() {

    }

    public void displayTruck() {

    }

    public void displayCar() {

    }

    public void displayMotorbike() {

    }

    public void deleteTruck() {

    }

    public void deleteCar() {

    }

    public void deleteMotorbike() {

    }
}
