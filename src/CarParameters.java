import java.awt.*;

public class CarParameters {

    private Brand carBrand;
    private String carModel;
    private int productionYear;
    private Color carColor;
    private int carPrice;
    private String registrationNumber;

    public CarParameters(Brand brand, String carModel, int productionYear, Color color, int price, String regMark) {
        this.carBrand = brand;
        this.carModel = carModel;
        this.productionYear = productionYear;
        this.carColor = color;
        this.carPrice = price;
        this.registrationNumber = regMark;
    }


    public Brand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(Brand carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Color getCarColor() {
        return carColor;
    }

    public void setCarColor(Color carColor) {
        this.carColor = carColor;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public StringBuilder conclusion(){
        StringBuilder sb = new StringBuilder();
        sb.append("Car brand: ").append(carBrand);
        sb.append(", Car model: ").append(carModel);
        sb.append(", Car year of release: ").append(productionYear);
        sb.append(", Number: ").append(registrationNumber);
        sb.append(", Car price: ").append(carPrice);
        return sb;
    }
}
