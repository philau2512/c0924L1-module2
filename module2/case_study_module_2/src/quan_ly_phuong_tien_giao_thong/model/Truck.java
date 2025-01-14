package quan_ly_phuong_tien_giao_thong.model;

public class Truck extends Vehicle {
    private double weight;

    public Truck(String licensePlate, String manufacturer, int yearOfManufacture, String owner, double weight) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getInfoVehicle() {
        return getLicensePlate() + "," + getManufacturer() + "," + getYearOfManufacture() + "," + getOwner() + "," + getWeight();
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Truck Information: " +
                        "License Plate: " + getLicensePlate() +
                        ", Manufacturer: " + getManufacturer() +
                        ", Year: " + getYearOfManufacture() +
                        ", Owner: " + getOwner() +
                        ", Weight: " + getWeight()
        );
    }

    @Override
    public String toString() {
        return "Truck{" +
                "licensePlate='" + getLicensePlate() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", owner='" + getOwner() + '\'' +
                ", Weight=" + getWeight() +
                '}';
    }
}
