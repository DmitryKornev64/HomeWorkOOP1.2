public class Main {
    public static void main(String[] args) {
        // дз 2
        //Car ladaGrande = new Car("Lada", "Grande", 2015, "желтого", "России", 1.7);
        Car ladaGrande = new Car(null, null, 0, null, null, 0);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "черный", "Германии", 3.0);
        Car bMVZ8   = new Car("BMW", "Z8", 2021, "черный", "Германии", 3.0);
        Car kiaSportage4 = new Car("Kia", "Sportage 4 поколение", 2018, "красный", "Южной Корее", 2.4);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "оранжевый", "Южной Корее", 1.6);
        ladaGrande.carInfo();
        audiA8.carInfo();
        bMVZ8.carInfo();
        kiaSportage4.carInfo();
        hyundaiAvante.carInfo();
    }
}