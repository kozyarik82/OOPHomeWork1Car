import transport.Competing;
import transport.Car;
import transport.Bus;
import transport.Truck;
import transport.ValidationUtils;
import transport.Transport;


public  class Driver<A extends Transport & Competing> {
    private final String fullName;
    private String drivingLicence;
    private final float experience;

    public Driver(String fullName, String drivingLicence, float experience) {
        this.fullName = ValidationUtils.validOrDefault(fullName,"default");
        setDrivingLicence(drivingLicence);
        this.experience = Math.max(experience, 0.0f);
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

    public void setDrivingLicence(String drivingLicence) {
        if (drivingLicence == null) {
            throw new IllegalArgumentException("Необходимо указать категорию водительского удостоверения");
        }else{
            this.drivingLicence = drivingLicence;
        }
    }

    public  void startDrivingCar(){
        System.out.println(" Начать движение ");
    }

    public  void stay(){
        System.out.println(" Остановиться ");
    }

    public void refuelTheCar(){
        System.out.println(" Заправить транспортное средство");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", drivingLicence='" + drivingLicence + '\'' +
                ", experience=" + experience +
                '}';
    }
}
