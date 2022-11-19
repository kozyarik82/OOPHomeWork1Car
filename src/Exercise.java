import java.util.Objects;

public class Exercise {
    private final int value;
    private final int value1;

    public Exercise(int value, int value1) {
        this.value = value;
        this.value1 = value1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Exercise exercise = (Exercise) o;
        return
                (value == exercise.value && value1 == exercise.value1) || (value == exercise.value1 && value1 == exercise.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value * value1,value+value1);
    }

    @Override
    public String toString() {
        return String.format("%s * %s = ? ", this.value, this.value1);
    }
}
