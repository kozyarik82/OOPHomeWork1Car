package transport;

import java.util.ArrayList;
import java.util.List;


public abstract class Driver<A extends Transport> {
    private final String fullName;
    private final String drivingLicence;
    private final float experience;
    private final A car;



    protected Driver(String fullName, String drivingLicence, float experience,A car) {
        this.fullName = ValidationUtils.validOrDefault(fullName,"default");
        this.drivingLicence = drivingLicence;
        this.experience = experience;
        this.car = car;

    }

    public String getFullName() {
        return fullName;
    }

    public float getExperience() {
        return experience;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public  void startMoving(){
        System.out.println(" Водитель " + getFullName() + " начинает движение на транспортном средстве " + car.getBrand() + " " + car.getModel());

    }

    public  void finishTheMove(){
        System.out.println(" Водитель " + getFullName() + " заканчивает движение на транспортном средстве " + car.getBrand() + " " + car.getModel());
    }

    public void refill(){
        System.out.println(" Водитель " + getFullName() + " заправляет транспортное средство " + this.car.getBrand() + " " + this.car.getModel());

    }

//    @Override
////    public String toString() {
////        return String.format("Водитель %s управляет транспортным средством %s %s и будет учавствовать в заезде ", this.fullName, this.car.getBrand(), this.car.getModel());
////    }
//

    @Override
    public String toString() {
        return " водитель " + fullName + " в/у категория " + drivingLicence + " стаж " + experience;
    }
}
