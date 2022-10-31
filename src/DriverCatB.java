import transport.Car;
import transport.Competing;
import transport.ValidationUtils;

public class DriverCatB  < B extends Car & Competing >{
    private final String fullName;
    private String drivingLicence;
    private final float experience;


    public DriverCatB(String fullName, String drivingLicence, float experience) {
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
        if (drivingLicence == "B") {
            this.drivingLicence = drivingLicence;
        }else{
            this.drivingLicence = " Вы не имеете права управлять данным транспортным средством";
        }
    }
    public  void startDrivingCar(){
        System.out.println(" Начать движение на легковом автомобиле ");
    }

    public  void stay(){
        System.out.println(" Остановиться ");
    }

    public void refuelTheCar(){
        System.out.println(" Заправить транспортное средство");
    }

    @Override
    public String toString() {
        return "DriverCatB{" +
                "fullName='" + fullName + '\'' +
                ", drivingLicence='" + drivingLicence + '\'' +
                ", experience=" + experience +
                '}';
    }
}
