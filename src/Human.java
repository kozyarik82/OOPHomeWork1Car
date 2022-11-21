import transport.Car;

import java.time.LocalDate;

public class Human {
    private static final String DEFAULT_STRING_VALUE = " информация не указана ";
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    Human(int yearOfBirth, String name, String town, String job) {
        setYearOfBirth(yearOfBirth);
        setName(name);
        setTown(town);
        setJob(job);
        this.name = ValidationUtils.validOrDefault(name, DEFAULT_STRING_VALUE);
        this.job = ValidationUtils.validOrDefault(job, DEFAULT_STRING_VALUE);
        this.town = ValidationUtils.validOrDefault(town, DEFAULT_STRING_VALUE);
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    void greetings() {
        System.out.println(" Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился/лась в " + yearOfBirth + " году. Я работаю на должности " + job + " . Будем знакомы! ");
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = ValidationUtils.validOrDefault(town,DEFAULT_STRING_VALUE);
    }

    public int getYearOfBirth () {
        return yearOfBirth;
    }

    public void setYearOfBirth ( int yearOfBirth){
        this.yearOfBirth = Math.max(yearOfBirth,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name,DEFAULT_STRING_VALUE);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = ValidationUtils.validOrDefault(job, DEFAULT_STRING_VALUE);
    }

    private int getAgeInYears() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - this.yearOfBirth;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ", мне " + getAgeInYears() + " лет, я из города " + town + ", работаю на должности " + job;
    }


}
