package transport;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    protected final String brand;
    protected final String model;

    protected final float engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();


    public Transport(String brand, String model, float engineVolume) {
        this.brand = ValidationUtils.validOrDefault(brand, DEFAULT_STRING_VALUE);
        this.model = ValidationUtils.validOrDefault(model, DEFAULT_STRING_VALUE);
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }
    public static final String DEFAULT_STRING_VALUE = "default";

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void addDriver(Driver<?>... drivers){this.drivers.addAll(Arrays.asList(drivers));}
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void startMoving();

    public abstract void finishTheMove();

    public abstract void printType();

    public abstract boolean getDiagnosed();

    public abstract void repair();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

}
