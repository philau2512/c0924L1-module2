package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.Car;
import quan_ly_phuong_tien_giao_thong.model.Motorbike;
import quan_ly_phuong_tien_giao_thong.model.Truck;
import quan_ly_phuong_tien_giao_thong.util.ReadAndWriteToCsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleService {
    private static final String CAR_FILE = "D:\\Admin\\Documents\\IT_CODEGYM\\MODULE-2\\nop_bai_tap_module_2\\c0924L1-module2\\module2\\case_study_module_2\\src\\quan_ly_phuong_tien_giao_thong\\data\\oto.csv";
    private static final String TRUCK_FILE = "D:\\Admin\\Documents\\IT_CODEGYM\\MODULE-2\\nop_bai_tap_module_2\\c0924L1-module2\\module2\\case_study_module_2\\src\\quan_ly_phuong_tien_giao_thong\\data\\xeTai.csv";
    private static final String MOTORBIKE_FILE = "D:\\Admin\\Documents\\IT_CODEGYM\\MODULE-2\\nop_bai_tap_module_2\\c0924L1-module2\\module2\\case_study_module_2\\src\\quan_ly_phuong_tien_giao_thong\\data\\xeMay.csv";

    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    Scanner scanner = new Scanner(System.in);

    public List<Truck> getAllTrucks() {
        List<Truck> trucks = new ArrayList<>();
        List<String> truckStringList = ReadAndWriteToCsv.ReadFromCsv(TRUCK_FILE);
        for (String truckString : truckStringList) {
            String[] truckArray = truckString.split(",");
            trucks.add(new Truck(truckArray[0], truckArray[1], Integer.parseInt(truckArray[2]), truckArray[3], Double.parseDouble(truckArray[4])));
        }
        return trucks;
    }

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
        List<String> truckList = new ArrayList<>();
        truckList.add(newTruck.getInfoVehicle());
        ReadAndWriteToCsv.WriteToCsv(TRUCK_FILE, truckList, APPEND);
    }

    public void displayTruck() {
        List<Truck> trucks = getAllTrucks();
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    public boolean deleteTruck(String licensePlate) {
        List<Truck> trucksList = getAllTrucks();
        boolean found = false;
        for (Truck truck : trucksList) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                trucksList.remove(truck);
                found = true;
                break;
            }
        }
        if (found) {
            List<String> truckStringList = new ArrayList<>();
            for (Truck truck : trucksList) {
                truckStringList.add(truck.getInfoVehicle());
            }
            ReadAndWriteToCsv.WriteToCsv(TRUCK_FILE, truckStringList, NOT_APPEND);
        }
        return found;
    }

    public Truck getTruckByLicensePlate(String licensePlate) {
        List<Truck> trucksList = getAllTrucks();
        for (Truck truck : trucksList) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                return truck;
            }
        }
        return null;
    }

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

    public List<Motorbike> getallMotorbikes() {
        List<Motorbike> motorbikeList = new ArrayList<>();
        List<String> motoStringList = ReadAndWriteToCsv.ReadFromCsv(MOTORBIKE_FILE);
        for (String moString : motoStringList) {
            String[] moStringArray = moString.split(",");
            motorbikeList.add(new Motorbike(moStringArray[0], moStringArray[1], Integer.parseInt(moStringArray[2]), moStringArray[3], Integer.parseInt(moStringArray[4])));
        }
        return motorbikeList;
    }

    public void addMotorbike() {
        System.out.print("Nhập biển kiểm soát: ");
        String licensePlate = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Nhập công suất: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        Motorbike newMotorbike = new Motorbike(licensePlate, manufacturer, yearOfManufacture, owner, capacity);
        List<String> carList = new ArrayList<>();
        carList.add(newMotorbike.getInfoVehicle());
        ReadAndWriteToCsv.WriteToCsv(MOTORBIKE_FILE, carList, APPEND);
    }

    public void displayMotorbike() {
        List<Motorbike> motorbikeList = getallMotorbikes();
        for (Motorbike motorbike : motorbikeList) {
            System.out.println(motorbike);
        }
    }

    public boolean deleteMotorbike(String licensePlate) {
        List<Motorbike> motorbikeList = getallMotorbikes();
        boolean found = false;
        for (Motorbike motorbike : motorbikeList) {
            if (motorbike.getLicensePlate().equals(licensePlate)) {
                motorbikeList.remove(motorbike);
                found = true;
                break;
            }
        }
        if (found) {
            List<String> motorbikeStringList = new ArrayList<>();
            for (Motorbike motorbike : motorbikeList) {
                motorbikeStringList.add(motorbike.getInfoVehicle());
            }
            ReadAndWriteToCsv.WriteToCsv(MOTORBIKE_FILE, motorbikeStringList, NOT_APPEND);
        }
        return found;
    }

    public Motorbike getMotorbikeByLicensePlate(String licensePlate) {
        List<Motorbike> motorbikeList = getallMotorbikes();
        for (Motorbike motorbike : motorbikeList) {
            if (motorbike.getLicensePlate().equals(licensePlate)) {
                return motorbike;
            }
        }
        return null;
    }
}
