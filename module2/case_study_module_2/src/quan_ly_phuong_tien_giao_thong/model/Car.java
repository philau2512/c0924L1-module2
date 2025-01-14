package quan_ly_phuong_tien_giao_thong.model;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String carType;

    public Car(String licensePlate, String manufacturer, int yearOfManufacture, String owner, int numberOfSeats, String carType) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getInfoVehicle() {
        return getLicensePlate() + "," + getManufacturer() + "," + getYearOfManufacture() + "," + getOwner() + "," + getNumberOfSeats() + "," + getCarType();
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Car Information: " +
                        "License Plate: " + getLicensePlate() +
                        ", Manufacturer: " + getManufacturer() +
                        ", Year: " + getYearOfManufacture() +
                        ", Owner: " + getOwner() +
                        ", Number of Seats: " + getNumberOfSeats() +
                        ", Car Type: " + getCarType()
        );
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + getLicensePlate() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", owner='" + getOwner() + '\'' +
                ", numberOfSeats=" + getNumberOfSeats() +
                ", carType='" + getCarType() + '\'' +
                '}';
    }
}
