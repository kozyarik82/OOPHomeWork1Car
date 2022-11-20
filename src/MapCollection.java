import java.util.*;

public class MapCollection {
    private static final Random RANDOM = new Random();
    private final Map<String, List<Integer>> mapList = new HashMap<>();

    public MapCollection() {
        for (int i = 0; i < 5; i++) {
            mapList.put(String.valueOf(i), generateNumbers());
        }
    }

    public Set<Map.Entry<String, List<Integer>>> getMapOriginal() {
        return mapList.entrySet();
    }

    private List<Integer> generateNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(RANDOM.nextInt(1000));
        }
        return list;
    }

    public Map<String, Integer> getMapTransformed() {
        Map<String, Integer> transform = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : mapList.entrySet()) {
            int sum = 0;
            for (Integer nam : entry.getValue()) {
                sum = sum + nam;
            }
            transform.put(entry.getKey(), sum);
        }
        return transform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapCollection that = (MapCollection) o;
        return Objects.equals(mapList, that.mapList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapList);
    }

    @Override
    public String toString() {
        return "MapCollection{" +
                "mapList=" + mapList +
                '}';
    }
}
