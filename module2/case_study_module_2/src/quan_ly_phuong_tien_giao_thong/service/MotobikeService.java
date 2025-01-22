package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.Motorbike;
import quan_ly_phuong_tien_giao_thong.util.ReadAndWriteToCsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotobikeService {
    private static final String MOTORBIKE_FILE = "D:\\Admin\\Documents\\IT_CODEGYM\\MODULE-2\\nop_bai_tap_module_2\\c0924L1-module2\\module2\\case_study_module_2\\src\\quan_ly_phuong_tien_giao_thong\\data\\xeMay.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    Scanner scanner = new Scanner(System.in);

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
