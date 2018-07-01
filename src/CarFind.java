import java.util.ArrayList;
import java.util.List;

public class CarFind{

    public List<CarParameters> findCarByBrand(List<CarParameters> carParameters, Brand brand){
        List<CarParameters> res = new ArrayList<>();
        for (CarParameters carParameter : carParameters) {
            if(carParameter.getCarBrand().equals(brand)){
                res.add(carParameter);
            }
        }
        return res;
    }
    public List<CarParameters> findCarByModelAndYear(List<CarParameters> carParameters, String model, int year, int timeOfUse ){
        List<CarParameters> res = new ArrayList<>();
        for (CarParameters carParameter : carParameters) {
            if (carParameter.getCarModel().equals(model) && year - carParameter.getProductionYear() > timeOfUse) {
                res.add(carParameter);
            }
        }
        return res;
    }
    public List<CarParameters> findCarByYearAndPrice(List<CarParameters> carParameters, int year, int price){
        List<CarParameters> res = new ArrayList<>();
        for (CarParameters carParameter : carParameters) {
            if (carParameter.getProductionYear() == year && carParameter.getCarPrice() < price){
                res.add(carParameter);
            }
        }
        return res;
    }
}
