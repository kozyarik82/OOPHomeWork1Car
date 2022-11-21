package transport;

public enum PassengerCapacity {
    extraSmall(0,10),small(0,25),medium(40,50),
    large(60,80),extraLarge(100,120);

    private final int capacityFrom;
    private final int capacityTo;

    PassengerCapacity(int capacityFrom,int capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    public int getCapacityFrom() {
        return capacityFrom;
    }

    public int getCapacityTo() {
        return capacityTo;
    }

    @Override
    public String toString() {
        String capacity = capacityFrom > 0 ? capacityFrom + "-" + capacityTo : String.valueOf(capacityTo);
        return "Вместимость:" + name() +  capacity + "мест";
    }
}
