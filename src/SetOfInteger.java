import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() <= 20) {
            numbers.add(random.nextInt(1000));
        }
   Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            Integer oddNumber = iter.next();
            if (oddNumber % 2 == 1) {
                iter.remove();
            }
        }
        System.out.println(numbers);

    }
}
