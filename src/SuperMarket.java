import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class SuperMarket {

    private static final List<String>NAMES = List.of("Stulov Oleg","Stakanova Veronika","Butylkin Ivan","Ruchkina Olga",
            "Myshkina Anna","Karandashov Vitaliy","Tetradkin Andrey","Kranov Petr","Bumagina Elena","Chasov Sergey");

    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println();
        add("Siropin Roman", queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);
        System.out.println();
        remove(queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);

    }

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }

    private static void add(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("ГААААЛЯЯЯЯЯЯЯЯЯ!!!");
            Queue<String> queue3 = new ArrayDeque<>();
            queue3.offer(name);
            System.out.println(queue3);
        } else if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        }else {
            queue2.offer(name);
        }
    }

    private static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        }else{
            queue2.poll();
        }
    }




}
