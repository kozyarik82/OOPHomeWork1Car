package transport;

public enum BodyType {
    sedan("седан"),hatchback("хетчбек"),coupe("купе"),universal("универсал"),suv("внедорожник"),
    crossover("кроссовер"),pickup("пикап"),van("фургон"), minivan("минивен");
    private final String name;

    BodyType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return " Тип кузова " +
                this.name();
    }
}
