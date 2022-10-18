public class Car {
    String brand;
    String model;
    int cproductionYear;
    String color;
    String productionCountry;
    double engineVolume;

    Car(String brand, String model, int cproductionYear, String color, String productionCountry, double engineVolume) {

        // Марка
        if (brand == null) {
            this.brand = "|default|";
        } else {
            this.brand = brand;
        }

        // Модель
        if (model == null) {
            this.model = "|default|";
        } else {
            this.model = model;
        }

        // Год производства
        if (cproductionYear <= 0) {
            this.cproductionYear = 2020;
        } else {
            this.cproductionYear = cproductionYear;
        }

        // Цвет кузова
        if (color == null) {
            this.color = "|белый|";
        } else {
            this.color = color;
        }
        // Срана сборки
        if (productionCountry == null) {
            this.productionCountry = "|default|";
        } else {
            this.productionCountry = productionCountry;
        }
        //объем двигателя
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    void carInfo() {
        System.out.println(brand + " " + model + ", " + cproductionYear + " год выпуска, сборка в " + productionCountry + ", " + color + " цвета, объем двигателя " + engineVolume + " л.");
    }
}
