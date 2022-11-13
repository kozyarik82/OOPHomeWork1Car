package transport;

public class Truck extends Transport implements Competing{

    private final LoadCapacity loadCapacity;
    public Truck(String brand, String model, float engineVolume,LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println(" Грузовик " + getBrand() + " " +getModel() + " начинает движение ");
    }

    @Override
    public void finishTheMove() {
        System.out.println(" Грузовик " + getBrand() + " " + getModel() + " заканчивает движение ");
    }

    @Override
    public void printType() {
        if (loadCapacity != null) {
            System.out.println(loadCapacity);
        }else{
            System.out.println("Информации недостаточно");
        }
    }

    @Override
    public boolean getDiagnosed() {
        return Math.random()>0.7;
    }

    @Override
    public void repair() {
        System.out.println(" Грузовик " + getBrand() + " " + getModel() + " отремонтирован ");
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
