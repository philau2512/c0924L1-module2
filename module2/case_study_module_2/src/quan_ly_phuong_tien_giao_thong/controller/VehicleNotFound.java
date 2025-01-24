package quan_ly_phuong_tien_giao_thong.controller;

public class VehicleNotFound extends RuntimeException {
    public VehicleNotFound(String message) {
        super(message);
    }
}
