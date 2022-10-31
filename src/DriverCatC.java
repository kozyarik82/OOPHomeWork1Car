import transport.Competing;
import transport.Truck;
import transport.ValidationUtils;

public class DriverCatC < C extends Truck & Competing >{
    private final String fullName;
    private String drivingLicence;
    private final float experience;

    public DriverCatC(String fullName, String drivingLicence, float experience) {
        this.fullName = ValidationUtils.validOrDefault(fullName,"default");
        setDrivingLicence(drivingLicence);
        this.experience = Math.max(experience, 0.0f);
    }

    public String getFullName() {
        return fullName;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public float getExperience() {
        return experience;
    }

    public void setDrivingLicence(String drivingLicence) {
        if (drivingLicence == "C") {
            this.drivingLicence = drivingLicence;
        } else {
            this.drivingLicence = " Вы не имеете права управлять данным транспортным средством";
        }
    }
    public  void startDrivingTruck(){
        System.out.println(" Начать движение на грузовике ");
    }

    public  void stay(){
        System.out.println(" Остановиться ");
    }

    public void refuelTheTruck(){
        System.out.println(" Заправить транспортное средство");
    }

    @Override
    public String toString() {
        return "DriverCatC{" +
                "fullName='" + fullName + '\'' +
                ", drivingLicence='" + drivingLicence + '\'' +
                ", experience=" + experience +
                '}';
    }
}
