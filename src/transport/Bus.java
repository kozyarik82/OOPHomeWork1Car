package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println(" Можно заправлять бензином или дизелем на заправке ");
    }

    public void bus() {
        System.out.println(" Автобус " + getBrand() + ", модель " + getModel() + ", год производства " + getProductionYear() + ", страна производства " + getProductionCountry() + ", максимальная скорость " + getMaxSpeed() + "км/ч, цвет " + getColor());
    }
}
