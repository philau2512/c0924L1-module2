package quan_ly_phuong_tien_giao_thong.model;

public class Motorbike extends Vehicle{
    private int capacity;

    public Motorbike(String licensePlate, String manufacturer, int yearOfManufacture, String owner, int capacity) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getInfoVehicle() {
        return getLicensePlate() + "," + getManufacturer() + "," + getYearOfManufacture() + "," + getOwner() + "," + getCapacity();
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Motorbike Information: " +
                        "License Plate: " + getLicensePlate() +
                        ", Manufacturer: " + getManufacturer() +
                        ", Year: " + getYearOfManufacture() +
                        ", Owner: " + getOwner() +
                        ", Capacity: " + getCapacity()
        );
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "licensePlate='" + getLicensePlate() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", owner='" + getOwner() + '\'' +
                ", Capacity=" + getCapacity() +
                '}';
    }
}
