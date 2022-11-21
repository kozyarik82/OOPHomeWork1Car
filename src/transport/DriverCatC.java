package transport;

import transport.Driver;
import transport.Truck;

public class DriverCatC extends Driver<Truck> {

    public DriverCatC(String fullName, String drivingLicence, float experience, Truck car) {
        super(fullName, "C", experience, car);
    }
}
