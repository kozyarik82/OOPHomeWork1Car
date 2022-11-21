package transport;




import java.util.*;

public abstract class Transport {
    protected final String brand;
    protected final String model;

    protected final float engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();


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

    public void addDriver(Driver<?>... drivers){
        this.drivers.addAll(Set.of(drivers));
        System.out.println("Список без повторов");
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Set.of(mechanics));
        System.out.println("Список без повторов");
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Set.of(sponsors));
        System.out.println("Список без повторов");
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
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
