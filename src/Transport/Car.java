package Transport;

import java.time.LocalDate;

public class Car {
    private final String brand; // марка
    private final String model; // модель
    private final int cproductionYear; // год выпуска
    private String color; // цвет
    private final String productionCountry; // страна сборки
    private double engineVolume; // объем двигателя


    private String transmission; // коробка передач

    private final String constitution; // тип кузова

    private String registrationNumber; // регистрационный номер

    private final int numberOfSeats; // количество мест

    private boolean winterTires; // тип шин

    private Key key;
    private Insurance insurance;

    public void carInfo() {
        System.out.println(getBrand() +
                " " + getModel() +
                ", " + getCproductionYear() + " год выпуска," +
                " сборка в " + getProductionCountry() + ", "
                + getColor() + " цвета," +
                " объем двигателя " + getEngineVolume() + " л.,"
                + getTransmission() + " - коробка передач, " +
                "тип кузова - " + getConstitution() +
                " регистрационный номер - " + getRegistrationNumber() +
                " количество мест - " + getNumberOfSeats() +
                ", тип шин - " + (winterTires ? "летняя, " : "зимняя, ") +
                (getKey().isRemoteEngineStart() ? "удаленный запуск двигателя, " : "бесключевой доступ") +
                ", " + (getKey().isKeylessEntry() ? "бесключевой доступ, " : " удаленный запуск двигателя") +
                ", номер страховки - " + getInsurance().getNumber() +
                ", стоимость страховки - " + getInsurance().getCost() +
                " руб., срок действия - " + getInsurance().getExpireDate());
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // КОНСТРУКТОР

    public Car(String brand,
               String model,
               int cproductionYear,
               String color,
               String productionCountry,
               double engineVolume,
               String transmission,
               String constitution,
               String registrationNumber,
               int numberOfSeats,
               boolean winterTires,
               Key key,
               Insurance insurance) {

        // марка
        if (brand == null || brand.length() == 0 || brand.isBlank()) {
            this.brand = "|default|";
        } else {
            this.brand = brand;
        }
        // модель
        if (model == null || model.length() == 0 || model.isBlank()) {
            this.model = "|default|";
        } else {
            this.model = model;
        }
        // год выпуска
        this.cproductionYear = cproductionYear > 0 ? cproductionYear : 2000;
        // цвет
        setColor(color);
        // страна сборки
        if (productionCountry == null || productionCountry.length() == 0 || productionCountry.isBlank()) {
            this.productionCountry = "|default|";
        } else {
            this.productionCountry = productionCountry;
        }
        // объем двигателя
        setEngineVolume(engineVolume);
        // коробка передач
        setTransmission(transmission);
        // тип кузова
        if (constitution == null || constitution.length() == 0 || constitution.isBlank()) {
            this.constitution = "|default|";
        } else {
            this.constitution = constitution;
        }
        // регистрационный номер
        setRegistrationNumber(registrationNumber);
        // количество мест
        this.numberOfSeats = Math.max(numberOfSeats, 1);
        // тип шин
        setWinterTires(winterTires);
        // ключ
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        // страховка
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // ЗАМЕНА ШИН

    public void setSeasonTires() {

             winterTires = !winterTires;
//        int currentMonth = LocalDate.now().getMonthValue();
//        if (currentMonth <= 4 || currentMonth >= 11) {
//            this.winterTires = true;
//        } else {
//            this.winterTires = false; // летняя резина
//        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // ПРОВЕРКА ПРАВИЛЬНОСТИ НАПИСАНИЯ НОМЕРА АВТО

    public boolean registrationNumberYes() {
        if (this.registrationNumber.length() != 9) {
            return false;
        }
        char[] registrationNumberChars = this.registrationNumber.toCharArray();
        return isNumberLetter(registrationNumberChars[0])
                && isNumber(registrationNumberChars[1])
                && isNumber(registrationNumberChars[2])
                && isNumber(registrationNumberChars[3])
                && isNumberLetter(registrationNumberChars[4])
                && isNumberLetter(registrationNumberChars[5])
                && isNumber(registrationNumberChars[6])
                && isNumber(registrationNumberChars[7])
                && isNumber(registrationNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // ГЕТТЕРЫ СЕТТЕРЫ
    // марка

    public String getBrand() {
        return brand;
    }
    // модель

    public String getModel() {
        return model;
    }
    // год выпуска

    public int getCproductionYear() {
        return cproductionYear;
    }
    // цвет

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.length() == 0 || color.isBlank()) {
            this.color = "|default|";
        } else {
            this.color = color;
        }
    }
    // страна сборки

    public String getProductionCountry() {
        return productionCountry;
    }
    // объем двигателя

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0 ? engineVolume : 2000;
    }
    // коробка передач

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.length() == 0 || transmission.isBlank()) {
            this.transmission = "|default|";
        } else {
            this.transmission = transmission;
        }
    }
    // тип кузова

    public String getConstitution() {
        return constitution;
    }
    // регистрационный номер

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.length() == 0 || registrationNumber.isBlank()) {
            this.registrationNumber = "|default|";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
    // количество мест

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    // тип шин

    public boolean isWinterTires() {
        return winterTires;
    }
    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    // ключ
    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
    // страховка
    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // вложенный класс «Ключ»
    public static class Key {
        private final boolean remoteEngineStart;

        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // вложенный класс «Страховка»
        public static class Insurance {

            private final LocalDate expireDate;
            private final double cost;
            private final String number;

            public Insurance(LocalDate expireDate, double cost, String number) {
                if (expireDate == null) {
                    this.expireDate = LocalDate.now().plusDays(365);
                } else {
                    this.expireDate = expireDate;
                }

                this.cost = cost;

                if (number == null) {
                    this.number = "123456789";
                } else {
                    this.number = number;
                }
            }

            public Insurance() {
                this(null, 10_000,null);
            }

            public LocalDate getExpireDate() {
                return expireDate;
            }

            public double getCost() {
                return cost;
            }

            public String getNumber() {
                return number;
            }

            public void checkExpireDate() {
                if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                    System.out.println("нужно срочно ехать оформлять новую страховку");
                }
            }

            public void checkNumber() {
                if (number.length() != 9) {
                    System.out.println("Номер страховки некорректный!");
                }
            }
        }
    }


























