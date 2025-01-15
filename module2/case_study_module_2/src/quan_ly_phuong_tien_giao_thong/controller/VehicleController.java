package quan_ly_phuong_tien_giao_thong.controller;

import quan_ly_phuong_tien_giao_thong.model.Car;
import quan_ly_phuong_tien_giao_thong.model.Motorbike;
import quan_ly_phuong_tien_giao_thong.model.Truck;
import quan_ly_phuong_tien_giao_thong.service.IVehicleService;
import quan_ly_phuong_tien_giao_thong.service.VehicleService;

import java.util.Scanner;

public class VehicleController implements IVehicleService {
    VehicleService vehicleService = new VehicleService();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addVehicle() {
        System.out.println("Chọn loại phương tiện cần thêm: \n" +
                "1. Xe tải \n" +
                "2. Ô tô \n" +
                "3. Xe máy\n" +
                "4. Quay lại");
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
            case 4:
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ !");
                System.exit(0);
        }
    }

    @Override
    public void displayVehicle() {
        System.out.println("Chọn loại phương tiện cần hiển thị: \n" +
                "1. Xe tải \n" +
                "2. Ô tô \n" +
                "3. Xe máy \n" +
                "4. Quay lại");
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
            case 4:
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ !");
                System.exit(0);
        }
    }

    @Override
    public void deleteVehicle() {
        System.out.println("Chọn loại phương tiện cần xóa: \n" +
                "1. Xe tải \n" +
                "2. Ô tô \n" +
                "3. Xe máy\n" +
                "4. Quay lại");
        System.out.print("Nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Nhập biển số xe tải cần xóa: ");
                String licenseTruckToDelete = scanner.nextLine();
                Truck truckToDelete = vehicleService.getTruckByLicensePlate(licenseTruckToDelete);
                if (truckToDelete != null) {
                    System.out.print("Bạn có chắc xóa không ? (y/n): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equals("y")) {
                        if (vehicleService.deleteTruck(licenseTruckToDelete)) {
                            System.out.println("✅ Thành công - Xóa xe tải mang biển số: " + licenseTruckToDelete);
                        } else {
                            System.out.println("❌ Thất bại khi xóa xe tải với biển số: " + licenseTruckToDelete);
                        }
                        System.out.println("Nhấn Enter để tiếp tục ...");
                        scanner.nextLine();
                    } else {
                        return;
                    }
                } else {
                    System.out.println("❌ Không tìm thấy xe tải với biển số: " + licenseTruckToDelete);
                }
                break;
            case 2:
                System.out.print("Nhập biển số xe ô tô cần xóa: ");
                String licenseCarToDelete = scanner.nextLine();
                Car carToDelete = vehicleService.getCarByLicensePlate(licenseCarToDelete);
                if (carToDelete != null) {
                    System.out.print("Bạn có chắc xóa không ? (y/n): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equals("y")) {
                        if (vehicleService.deleteCar(licenseCarToDelete)) {
                            System.out.println("✅ Thành công - Xóa xe ô tô mang biển số: " + licenseCarToDelete);
                        } else {
                            System.out.println("❌ Thất bại khi xóa xe ô tô với biển số: " + licenseCarToDelete);
                        }
                        System.out.println("Nhấn Enter để tiếp tục ...");
                        scanner.nextLine();
                    } else {
                        return;
                    }
                } else {
                    System.out.println("❌ Không tìm thấy xe ô tô với biển số: " + licenseCarToDelete);
                }
                break;
            case 3:
                System.out.print("Nhập biển số xe mô tô cần xóa: ");
                String licenseMotoToDelete = scanner.nextLine();
                Motorbike MotoToDelete = vehicleService.getMotorbikeByLicensePlate(licenseMotoToDelete);
                if (MotoToDelete != null) {
                    System.out.print("Bạn có chắc xóa không ? (y/n): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equals("y")) {
                        if (vehicleService.deleteMotorbike(licenseMotoToDelete)) {
                            System.out.println("✅ Thành công - Xóa xe mô tô mang biển số: " + licenseMotoToDelete);
                        } else {
                            System.out.println("❌ Thất bại khi xóa xe mô tô với biển số: " + licenseMotoToDelete);
                        }
                        System.out.println("Nhấn Enter để tiếp tục ...");
                        scanner.nextLine();
                    } else {
                        return;
                    }
                } else {
                    System.out.println("❌ Không tìm thấy xe mô tô với biển số: " + licenseMotoToDelete);
                }
                break;
            case 4:
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ !");
                System.exit(0);
        }
    }
}
