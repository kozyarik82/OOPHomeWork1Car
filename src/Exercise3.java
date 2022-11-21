import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Exercise3 {
    private final Map<String, Integer> map = new HashMap<>();

    public void addMap(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        }else{
            int mapValue = map.get(key);
            if (mapValue == value) {
                throw new IllegalArgumentException("Такой ключ уже существует и значения совпадают!");
            }else {
                map.put(key, mapValue + value);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise3 exercise3 = (Exercise3) o;
        return Objects.equals(map, exercise3.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    @Override
    public String toString() {
        return "Exercise3{" +
                "map=" + map +
                '}';
    }
}
