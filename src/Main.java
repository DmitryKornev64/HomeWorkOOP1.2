import Transport.Car ;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // дз 2
        //Transport.Car ladaGrande = new Transport.Car("Lada","Grande",2015,"желтого","России",1.7,"Механическая","Седан","ПВ678К37",5,true);
        Transport.Car ladaGrande = new Transport.Car(
                null,
                null,
                0,
                null,
                null,
                0,
                null,
                null,
                "",
                -2,
                false,
                new Car.Key(true,true),
                null);
        ladaGrande.carInfo();
        ladaGrande.setInsurance(new Car.Insurance(LocalDate.now(),50_000, "68924140522"));
        ladaGrande.getInsurance().checkExpireDate();
        ladaGrande.getInsurance().checkNumber();


        Transport.Car audiA8 = new Transport.Car(
                "Audi",
                "A8 50 L TDI quattro",
                2020,
                "черный",
                "Германии",
                3.0,
                "Автоматическая",
                "Седан",
                "ВВ423К45",
                5,
                true,
                new Car.Key(),
                null);

       Transport.Car bMVZ8   = new Transport.Car(
               "BMW",
               "Z8",
               2021,
               "черный",
               "Германии",
               3.0,
               "Механическая",
               "Хэтчбек",
               "НЕ948К84",
               5,
               true,
               new Car.Key(),
               null);

        Transport.Car kiaSportage4 = new Transport.Car(
                "Kia",
                "Sportage 4 поколение",
                2018,
                "красный",
                "Южной Корее",
                2.4,
                "Автоматическая",
                "Седан",
                "НР988К57",
                5,
                true,
                new Car.Key(),
                null);

        Transport.Car hyundaiAvante = new Car (
                "Hyundai",
                "Avante",
                2016,
                "оранжевый",
                "Южной Корее",
                1.6,
                "Механическая",
                "Хэтчбек",
                "ОО348К07",
                5,
                true,
                new Car.Key(),
                null);
        audiA8.carInfo();
        bMVZ8.carInfo();
        kiaSportage4.carInfo();
        hyundaiAvante.carInfo();
    }
}