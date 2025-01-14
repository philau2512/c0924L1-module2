package quan_ly_phuong_tien_giao_thong.controller;
import quan_ly_phuong_tien_giao_thong.service.IVehicleService;
import quan_ly_phuong_tien_giao_thong.service.VehicleService;

import java.util.Scanner;

public class VehicleController implements IVehicleService {
    private static final String CAR_FILE = "data/oto.csv";
    private static final String TRUCK_FILE = "data/xeTai.csv";
    private static final String MOTORBIKE_FILE = "data/xeMay.csv";
    VehicleService vehicleService = new VehicleService();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addVehicle() {
        System.out.println("Chọn loại phương tiện cần thêm: +\n" +
                "1. Xe tải + \n" +
                "2. Ô tô + \n" +
                "3. Xe máy");
        System.out.print("Nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                vehicleService.addTruck();
                break;
            case 2:
                vehicleService.addCar();
                break;
            case 3:
                vehicleService.addMotorbike();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ !");
                System.exit(0);
        }
    }

    @Override
    public void displayVehicle() {
        System.out.println("Chọn loại phương tiện cần hiển thị: +\n" +
                "1. Xe tải + \n" +
                "2. Ô tô + \n" +
                "3. Xe máy");
        System.out.print("Nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                vehicleService.displayTruck();
                break;
            case 2:
                vehicleService.displayCar();
                break;
            case 3:
                vehicleService.displayMotorbike();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ !");
                System.exit(0);
        }
    }

    @Override
    public void deleteVehicle() {
        System.out.println("Chọn loại phương tiện cần hiển thị: +\n" +
                "1. Xe tải + \n" +
                "2. Ô tô + \n" +
                "3. Xe máy");
        System.out.print("Nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                vehicleService.deleteTruck();
                break;
            case 2:
                vehicleService.deleteCar();
                break;
            case 3:
                vehicleService.deleteMotorbike();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ !");
                System.exit(0);
        }
    }
}
