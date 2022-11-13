package transport;

import java.sql.Driver;

public class Bus extends Transport implements Competing {

    private final PassengerCapacity passengerCapacity;

    public Bus(String brand, String model, float engineVolume,PassengerCapacity passengerCapacity) {
        super(brand, model, engineVolume);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println(" Автобус " + getBrand() + " " +getModel() + " начинает движение ");
    }

    @Override
    public void finishTheMove() {
        System.out.println(" Автобус " + getBrand() + " " + getModel() + " заканчивает движение ");
    }

    @Override
    public void printType() {
        if (this.passengerCapacity != null) {
            System.out.println(passengerCapacity);
        }else{
            System.out.println(" Информации недостаточно ");
        }
    }
    public void doInspectionOfTransport() {
        System.out.println(" Автобусу " + getBrand() + " " + getModel() + " техосмотр не требуется ");
    }

    @Override
    public boolean getDiagnosed() {
        System.out.println(" Автобусу " + getBrand() + " " + getModel() + " диагностика не требуется ");
        return true;
    }

    @Override
    public void repair() {
        System.out.println(" Автобус " + getBrand() + " " + getModel() + " отремонтирован ");
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
}
