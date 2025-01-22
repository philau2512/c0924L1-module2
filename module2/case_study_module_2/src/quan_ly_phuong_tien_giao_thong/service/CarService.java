package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.Car;
import quan_ly_phuong_tien_giao_thong.util.ReadAndWriteToCsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService {
    private static final String CAR_FILE = "D:\\Admin\\Documents\\IT_CODEGYM\\MODULE-2\\nop_bai_tap_module_2\\c0924L1-module2\\module2\\case_study_module_2\\src\\quan_ly_phuong_tien_giao_thong\\data\\oto.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    Scanner scanner = new Scanner(System.in);

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        List<String> carStringList = ReadAndWriteToCsv.ReadFromCsv(CAR_FILE);
        for (String carString : carStringList) {
            String[] carArray = carString.split(",");
            cars.add(new Car(carArray[0], carArray[1], Integer.parseInt(carArray[2]), carArray[3], Integer.parseInt(carArray[4]), carArray[5]));
        }
        return cars;
    }

    public void addCar() {
        System.out.print("Nhập biển kiểm soát: ");
        String licensePlate = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu xe: ");
        String carType = scanner.nextLine();

        Car newCar = new Car(licensePlate, manufacturer, yearOfManufacture, owner, numberOfSeats, carType);
        List<String> carList = new ArrayList<>();
        carList.add(newCar.getInfoVehicle());
        ReadAndWriteToCsv.WriteToCsv(CAR_FILE, carList, APPEND);
    }

    public void displayCar() {
        List<Car> cars = getAllCars();
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public boolean deleteCar(String licensePlate) {
        List<Car> carsList = getAllCars();
        boolean found = false;
        for (Car car : carsList) {
            if (car.getLicensePlate().equals(licensePlate)) {
                carsList.remove(car);
                found = true;
                break;
            }
        }
        if (found) {
            List<String> carStringList = new ArrayList<>();
            for (Car car : carsList) {
                carStringList.add(car.getInfoVehicle());
            }
            ReadAndWriteToCsv.WriteToCsv(CAR_FILE, carStringList, NOT_APPEND);
        }
        return found;
    }

    public Car getCarByLicensePlate(String licensePlate) {
        List<Car> carsList = getAllCars();
        for (Car car : carsList) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }
        return null;
    }
}
