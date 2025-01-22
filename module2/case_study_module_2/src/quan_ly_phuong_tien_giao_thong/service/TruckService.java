package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.Truck;
import quan_ly_phuong_tien_giao_thong.util.ReadAndWriteToCsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService {
    private static final String TRUCK_FILE = "D:\\Admin\\Documents\\IT_CODEGYM\\MODULE-2\\nop_bai_tap_module_2\\c0924L1-module2\\module2\\case_study_module_2\\src\\quan_ly_phuong_tien_giao_thong\\data\\xeTai.csv";
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
}
