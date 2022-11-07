package transport;

public abstract class Transport {
    protected final String brand;
    protected  final String model;

    protected final float engineVolume;

//    protected final int productionYear;
//    protected final String productionCountry;
//    protected String color;
//    protected int maxSpeed;

    public Transport(String brand, String model, float engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand,DEFAULT_STRING_VALUE);
        this.model = ValidationUtils.validOrDefault(model,DEFAULT_STRING_VALUE);
        this.engineVolume = engineVolume>0.0f ? engineVolume:1.5f;
    }


//    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
////        setBrand(brand);
////        setModel(model);
////        this.productionYear = productionYear >= 0 ? productionYear : 2000;
////        this.productionCountry = ValidationUtils.validOrDefault(productionCountry,DEFAULT_STRING_VALUE);
////        setColor(color);
////        this.maxSpeed = maxSpeed;
//    }

//    public int getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }

    public static final String DEFAULT_STRING_VALUE = "default";

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getBrand() { return brand; }

//    public void setBrand(String brand) {
//
//        this.brand = ValidationUtils.validOrDefault(brand,DEFAULT_STRING_VALUE);
//    }

    public String getModel() {
        return model;
    }

    public abstract void startMoving();

    public abstract void finishTheMove();

    public abstract void printType();

    public abstract boolean getDiagnosed();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    //    public void setModel(String model) {
//        this.model = ValidationUtils.validOrDefault(model,DEFAULT_STRING_VALUE);
//    }

//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = ValidationUtils.validOrDefault(color,DEFAULT_STRING_VALUE);
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed>0 ? maxSpeed:1;
//    }

//    @Override
//    public String toString() {
//        return "Transport{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", productionYear=" + productionYear +
//                ", productionCountry='" + productionCountry + '\'' +
//                ", color='" + color + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }
//
//    public abstract void refill();
}
