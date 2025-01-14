package quan_ly_phuong_tien_giao_thong.view;

import quan_ly_phuong_tien_giao_thong.controller.VehicleController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleController controller = new VehicleController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiển thị phương tiện.");
            System.out.println("3. Xóa phương tiện.");
            System.out.println("4. Thoát.");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    controller.addVehicle();
                    break;
                case 2:
                    controller.displayVehicle();
                    break;
                case 3:
                    controller.deleteVehicle();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    System.exit(0);
            }
        }
    }
}

