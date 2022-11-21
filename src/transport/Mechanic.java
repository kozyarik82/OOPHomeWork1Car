package transport;

public class Mechanic<T extends Transport> {
    private final String fullName;
    private final String company;


    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;

    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean getDiagnosed(T transport) {
        return transport.getDiagnosed();
    }

    public void repair(T transport) {
        transport.repair();
    }

    @Override
    public String toString() {
        return " механик " + fullName + " из компании " + company;
    }
}
