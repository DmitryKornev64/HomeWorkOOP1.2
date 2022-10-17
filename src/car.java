public class car {
    String brand;
    String model;
    int cproductionYear;
    String color;
    String productionCountry;
    String engineVolume;

    car(String brand, String model, int cproductionYear, String color, String productionCountry, String engineVolume) {

        this.brand = brand;
        this.model = model;
        this.cproductionYear = cproductionYear;
        this.color = color;
        this.productionCountry = productionCountry;
        this.engineVolume = engineVolume;
    }

    void carInfo() {
        System.out.println(brand + " " + model + ", " + cproductionYear + " год выпуска, сборка в " + productionCountry + ", " + color + " цвета, объем двигателя " + engineVolume);
    }
}
