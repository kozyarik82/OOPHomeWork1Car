import transport.Bus;
import transport.Competing;
import transport.Transport;
import transport.ValidationUtils;

public class DriverCatD <D extends Bus & Competing> {
    private final String fullName;
    private String drivingLicence;
    private final float experience;

    public DriverCatD(String fullName, String drivingLicence, float experience) {
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
        if (drivingLicence == "D") {
            this.drivingLicence = drivingLicence;
        }else{
            this.drivingLicence = " Вы не имеете права управлять данным транспортным средством";
        }
    }
    public  void startDrivingBus(){
        System.out.println(" Начать движение на автобусе ");
    }

    public  void stay(){
        System.out.println(" Остановиться ");
    }

    public void refuelTheBus(){
        System.out.println(" Заправить транспортное средство");
    }

    @Override
    public String toString() {
        return "DriverCatD{" +
                "fullName='" + fullName + '\'' +
                ", drivingLicence='" + drivingLicence + '\'' +
                ", experience=" + experience +
                '}';
    }
}
