package transport;

public class Sponsor {
    private final String fullName;
    private final int sum;

    public Sponsor(String fullName, int sum) {
        this.fullName = fullName;
        this.sum = sum;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSum() {
        return sum;
    }

    public void sponsorARace() {
        System.out.println(" Спонсор " + getFullName() + " проспонсировал заезд на сумму " + getSum());
    }

    @Override
    public String toString() {
        return " Спонсор " +
                 fullName +
                " сумма поддержки " + sum;
    }
}
