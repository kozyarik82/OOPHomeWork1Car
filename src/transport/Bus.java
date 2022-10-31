package transport;

import java.time.LocalTime;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
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


    //    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//    }
//
//    @Override
//    public void refill() {
//        System.out.println(" Можно заправлять бензином или дизелем на заправке ");
//    }
//
//    public void bus() {
//        System.out.println(" Автобус " + getBrand() + ", модель " + getModel() + ", год производства " + getProductionYear() + ", страна производства " + getProductionCountry() + ", максимальная скорость " + getMaxSpeed() + "км/ч, цвет " + getColor());
//    }
}
