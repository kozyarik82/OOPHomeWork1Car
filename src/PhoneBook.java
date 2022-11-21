import java.util.HashMap;
import java.util.Objects;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Рожков О.Л", "+1254367895");
        phoneBook.put("Пирожков О.Л", "+12526458895");
        phoneBook.put("Божков О.П", "+72543636995");
        phoneBook.put("Ложков Ы.Ю", "+12543678995");
        phoneBook.put("Рыжков Т.Ц", "+3584367895");
        phoneBook.put("Пушков Л.В", "+8574367895");
        phoneBook.put("Кружков О.Л", "+781254367895");
        phoneBook.put("Ляжков О.Л", "+35454367895");
        System.out.println(phoneBook.entrySet());
    }
    private final String fullName;
    private final String numberPhone;

    public PhoneBook(String fullName, String numberPhone) {
        this.fullName = fullName;
        this.numberPhone = numberPhone;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(fullName, phoneBook.fullName) && Objects.equals(numberPhone, phoneBook.numberPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, numberPhone);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "fullName='" + fullName + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
