import java.util.Objects;
import java.util.Set;

public class Passport {
    private final Set<Integer> numberOfPassport;
    private final String lastName;
    private final String name;
    private final String dateOfBird;
    private final String patronymic;

    public Passport(Set<Integer> numberOfPassport, String lastName, String name, String dateOfBird, String patronymic) {
        this.numberOfPassport = numberOfPassport;
        this.lastName = lastName;
        this.name = name;
        this.dateOfBird = dateOfBird;
        this.patronymic = patronymic;
    }

    public Set<Integer> getNumberOfPassport() {
        return numberOfPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBird() {
        return dateOfBird;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public boolean isSetNumber(Integer s) {
        return numberOfPassport.contains(s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(numberOfPassport, passport.numberOfPassport) && Objects.equals(lastName, passport.lastName) && Objects.equals(name, passport.name) && Objects.equals(dateOfBird, passport.dateOfBird) && Objects.equals(patronymic, passport.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPassport, lastName, name, dateOfBird, patronymic);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numberOfPassport=" + numberOfPassport +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBird='" + dateOfBird + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
