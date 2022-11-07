package transport;
public class Bus extends Transport implements Competing {
    public enum PassengerCapacity{
        extraSmall(0,10),small(0,25),medium(40,50),
        large(60,80),extraLarge(100,120);

        private final int capacityFrom;
        private final int capacityTo;

        public int getCapacityFrom() {
            return capacityFrom;
        }

        public int getCapacityTo() {
            return capacityTo;
        }

        PassengerCapacity(int capacityFrom,int capacityTo) {
            this.capacityFrom = capacityFrom;
            this.capacityTo = capacityTo;
        }

        @Override
        public String toString() {
            String capacity = capacityFrom > 0 ? capacityFrom + "-" + capacityTo : String.valueOf(capacityTo);
            return "Вместимость:" + name() +  capacity + "мест";
        }
    }

    private final PassengerCapacity passengerCapacity;

    public Bus(String brand, String model, float engineVolume,PassengerCapacity passengerCapacity) {
        super(brand, model, engineVolume);
        this.passengerCapacity = passengerCapacity;
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
        if (this.passengerCapacity != null) {
            System.out.println(passengerCapacity);
        }else{
            System.out.println(" Информации недостаточно ");
        }
    }

    @Override
    public boolean getDiagnosed() {
        System.out.println(" Автобусу " + getBrand() + " " + getModel() + " диагностика не требуется ");
        return true;
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
