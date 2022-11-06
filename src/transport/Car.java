package transport;

public class Car extends Transport implements Competing {
    private final BodyType bodyType;

    public enum BodyType{
        sedan("седан"),hatchback("хетчбек"),coupe("купе"),universal("универсал"),suv("внедорожник"),
        crossover("кроссовер"),pickup("пикап"),van("фургон"), minivan("минивен");
        private final String name;

        public String getName() {
            return this.name;
        }

        BodyType(String name) {
            this.name = name;
        }
    }
    public Car(String brand, String model, float engineVolume,BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("start");
    }

    @Override
    public void finishTheMove() {
        System.out.println("finish");
    }

    @Override
    public void printType() {
        if (this.bodyType != null) {
            System.out.println(bodyType);
        }else{
            System.out.println("Информации не достаточно");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Пора сделать пит-стоп");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость");
    }


//    private float engineVolume;
//    private String transmission;
//    private  final String bodyType;
//    private String regNumber;
//    private final int seatsCount;
//    private boolean winterTires;
//    private final Key key;
//    private final Insurance insurance;


//    public Car(String brand, String model, String color,  int productionYear, String productionCountry,float engineVolume,String transmission,String bodyType,String regNumber,int seatsCount,boolean winterTires,Key key,Insurance insurance) {
//        super(brand, model, productionYear, productionCountry, color,100);
//        setEngineVolume(engineVolume);
//        setTransmission(transmission);
//        this.bodyType = validOrDefault(bodyType, DEFAULT_STRING_VALUE);
//        setRegNumber(regNumber);
//        this.seatsCount = Math.max(seatsCount, 1);
//        setWinterTires(winterTires);
//        this.key = key;
//        this.insurance = insurance;
//    }

//    public static final String DEFAULT_STRING_VALUE = " default";
//
//
//    private String validOrDefault(String value, String defaultValue) {
//        if (value == null || value.isBlank()) {
//            return defaultValue;
//        }else{
//            return value;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", engineVolume=" + engineVolume +
//                ", color='" + color + '\'' +
//                ", productionYear=" + productionYear +
//                ", productionCountry='" + productionCountry + '\'' +
//                ", transmission='" + transmission + '\'' +
//                ", bodyType='" + bodyType + '\'' +
//                ", regNumber='" + regNumber + '\'' +
//                ", seatsCount=" + seatsCount +
//                ", winterTires=" + winterTires +
//                '}';
//    }
//
//    @Override
//    public void refill() {
//        System.out.println(" Можно заправить беезином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар ");
//    }
//
//    public void setSeasonTires() {
//        int currentMonth = LocalDate.now().getMonthValue();
//        this.winterTires = currentMonth <= 4 || currentMonth >= 11;
//    }
//
//    public boolean isRegNumber() {
//        if (this.regNumber.length() != 9) {
//            return false;
//        }
//        char[] regNumberChars = this.regNumber.toCharArray();
//        return isNumberLetter(regNumberChars[0]) && isNumber(regNumberChars[1]) && isNumber(regNumberChars[2]) && isNumber(regNumberChars[3]) && isNumberLetter(regNumberChars[4]) && isNumberLetter(regNumberChars[5]) && isNumber(regNumberChars[6]) && isNumber(regNumberChars[7]) && isNumber(regNumberChars[8]);
//    }
//
//    private boolean isNumber(char symbol) {
//        return symbol >= '0' && symbol <= '9';
//    }
//
//    private boolean isNumberLetter(char symbol) {
//        String allowedSymbols = "АВЕКМНОРСТУХ";
//        return allowedSymbols.contains("" + symbol);
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public int getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public int getSeatsCount() {
//        return seatsCount;
//    }
//
//    public float getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(float engineVolume) {
//        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = validOrDefault(color, "white");
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public void setTransmission(String transmission) {
//        this.transmission = validOrDefault(transmission,DEFAULT_STRING_VALUE);
//    }
//
//    public String getRegNumber() {
//        return regNumber;
//    }
//
//    public void setRegNumber(String regNumber) {
//        this.regNumber = validOrDefault(regNumber,DEFAULT_STRING_VALUE);
//    }
//
//    public boolean isWinterTires() {
//        return winterTires;
//    }
//
//    public void setWinterTires(boolean winterTires) {
//        this.winterTires = winterTires;
//    }
//
//    public Key getKey() {
//        return key;
//    }
//
//    public Insurance getInsurance() {
//        return insurance;
//    }
//
//    public static class Key {
//        private final boolean remoteEngineStart;
//        private final boolean keyLessAccess;
//
//        public Key(boolean remoteEngineStart, boolean keyLessAccess) {
//            this.remoteEngineStart = remoteEngineStart;
//            this.keyLessAccess = keyLessAccess;
//        }
//
//        public boolean isRemoteEngineStart() {
//            return remoteEngineStart;
//        }
//
//        public boolean isKeyLessAccess() {
//            return keyLessAccess;
//        }
//    }
//
//    public static class Insurance {
//        private final LocalDate validUntil;
//        private final float cost;
//        private final String number;
//
//        public Insurance(LocalDate validUntil, float cost, String number) {
//            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
//            this.cost = Math.max(cost, 1f);
//            this.number = number!=null ? number:"default";
//        }
//
//        public boolean isNumberValid() {
//            return number.length() == 9;
//        }
//
//        public boolean isInsuranceValid() {
//            return LocalDate.now().isBefore(this.validUntil);
//        }
//    }
}




