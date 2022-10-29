package transport;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Train extends Transport {
    private float tripPrice;
    private int travelTime;
    private String departureStation;
    private String endStation;
    private int amountOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, float tripPrice, int travelTime, String departureStation, String endStation, int amountOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        setTripPrice(tripPrice);
        setTravelTime(travelTime);
        setDepartureStation(departureStation);
        setEndStation(endStation);
        setAmountOfWagons(amountOfWagons);
    }

    public float getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(float tripPrice) {
        this.tripPrice = tripPrice > 0.0f ? tripPrice:1.0f;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = ValidationUtils.validOrDefault(departureStation,DEFAULT_STRING_VALUE);
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = ValidationUtils.validOrDefault(endStation,DEFAULT_STRING_VALUE);
    }

    public int getAmountOfWagons() {
        return amountOfWagons;
    }

    public void setAmountOfWagons(int amountOfWagons) {
        this.amountOfWagons = amountOfWagons>0 ? amountOfWagons:1;
    }

    public void train() {
        System.out.println(" Поезд " + getBrand() + " № " + getModel() + ", год производства " + getProductionYear() + ", страна производства " + getProductionCountry() + ", максимальная скорость " + getMaxSpeed() + "км/ч, цвет " + getColor() + ", станция отправления " + getDepartureStation() + ", конечная станция " + getEndStation() + ", время в пути " + getTravelTime() + " часов, цена билета " + getTripPrice() + ", колличество вагонов " + getAmountOfWagons());
    }


    @Override
    public void refill() {
        System.out.println(" Нужно заправлять дизелем ");
    }
}
