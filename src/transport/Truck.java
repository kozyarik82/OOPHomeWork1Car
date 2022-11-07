package transport;

public class Truck extends Transport implements Competing{
    public enum LoadCapacity{
        N1(null,3.5f),N2(3.5f,12f),N3(12f,null);


        private final Float capacityFrom;
        private final Float capacityTo;

        LoadCapacity(Float capacityFrom,Float capacityTo) {
            this.capacityFrom = capacityFrom;
            this.capacityTo = capacityTo;
        }

        public Float getCapacityFrom() {
            return capacityFrom;
        }

        public Float getCapacityTo() {
            return capacityTo;
        }


        @Override
        public String toString() {
            String capacityFromString = capacityFrom != null ? "от" + capacityFrom : "";
            String capacityToString = capacityTo != null ? "до" + capacityTo : "";
            return "Грузоподъемность" + capacityFromString + capacityToString;
        }
    }

    private final LoadCapacity loadCapacity;
    public Truck(String brand, String model, float engineVolume,LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
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
