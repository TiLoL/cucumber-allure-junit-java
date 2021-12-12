package objects;

public class UsedCar {

    private String model;
    private String manufacturer;
    private int Year;
    private int Price;
    private String EngineType;
    private String modification;
    private double mileage;

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setEngineType(String engineType) {
        EngineType = engineType;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return Year;
    }

    public int getPrice() {
        return Price;
    }

    public String getEngineType() {
        return EngineType;
    }

    public String getModification() {
        return modification;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", Year=" + Year +
                ", Price=" + Price +
                ", EngineType='" + EngineType + '\'' +
                ", modification='" + modification + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
