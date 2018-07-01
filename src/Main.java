import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarParameters car1 = new CarParameters(Brand.BMW,"X7",2009, Color.RED,2999999, "AA5368H");
        CarParameters car2 = new CarParameters(Brand.OPEL,"Vectra",2000, Color.GREEN,150000,"АА5555НН");
        CarParameters car3 = new CarParameters(Brand.FORD,"Focus",2007,Color.DARK_GRAY,125000,"AA1234HR");
        CarParameters car4 = new CarParameters(Brand.FORD, "Mustung", 2012,Color.white, 6000000, "AB8977HN");
        CarParameters car5 = new CarParameters(Brand.NISSAN, "Leaf", 2015, Color.BLUE,425600, "QR5472TY");
        CarParameters car6 = new CarParameters(Brand.TOYOTA,"Camry", 1999, Color.lightGray, 99000,"GN344ZX");
        CarParameters car7 = new CarParameters(Brand.TOYOTA,"Babah", 1984,Color.PINK,5000,"Alah Akbar");

        List<CarParameters> cars = Arrays.asList(car1, car2,car3,car4,car5,car6,car7);

        CarFind carFind = new CarFind();

        System.out.println("Search by brand BMW : ");
        List<CarParameters> result1 = carFind.findCarByBrand(cars, Brand.BMW);
        for (CarParameters car : result1) {
            System.out.println(car.conclusion());
        }
        System.out.println();

        System.out.println("Search car model FORD by lifetime more then 5 year: ");
        List<CarParameters> result2 = carFind.findCarByModelAndYear(cars,"Focus",2018, 5);
        for (CarParameters car : result2) {
            System.out.println(car.conclusion());
        }
        System.out.println();

        System.out.println("Search car release of 1999 and price under 150000");
        List<CarParameters> result3 = carFind.findCarByYearAndPrice(cars,1999,150000);
        for (CarParameters car : result3) {
            System.out.println(car.conclusion());
        }

    }

}
