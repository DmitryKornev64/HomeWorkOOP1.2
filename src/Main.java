public class Main {
    public static void main(String[] args) {
// дз 2
        car ladaGrande = new car("Lada", "Grande", 2015, "желтого", "России", "1.7");
        car audiA8 = new car("Audi", "A8 50 L TDI quattro", 2020, "черный", "Германии", "3.0");
        car bMVZ8 = new car("BMW", "Z8", 2021, "черный", "Германии", "3.0");
        car kiaSportage4 = new car("Kia", "Sportage 4 поколение", 2018, "красный", "Южной Корее", "2.4");
        car hyundaiAvante = new car("Hyundai", "Avante", 2016, "оранжевый", "Южной Корее", "1.6");
        ladaGrande.carInfo();
        audiA8.carInfo();
        bMVZ8.carInfo();
        kiaSportage4.carInfo();
        hyundaiAvante.carInfo();
    }
}