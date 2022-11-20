import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    public MultiplicationTable() {
        Random random = new Random();
        while (exercises.size() < 15) {
            exercises.add(new Exercise(random.nextInt(10), random.nextInt(10)));
        }
    }

    private final Set<Exercise> exercises = new HashSet<>();

    @Override
    public String toString() {
        return "MultiplicationTable{" +
                "exercises=" + exercises +
                '}';
    }
}
