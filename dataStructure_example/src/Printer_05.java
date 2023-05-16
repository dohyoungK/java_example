import java.util.*;
public class Printer_05 {
    public static void main(String[] args) {
        System.out.println(queuePrinter(2, 10, new int[]{7, 4, 5, 6}));
    }

    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // TODO: queue1 = documents, queue2

        int time = 0;
        int capacity = 0;
        Integer[] docs = Arrays.stream(documents).boxed().toArray(Integer[]::new);
        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(docs));
        Queue<Integer> queue2 = new LinkedList<>();

        while (!queue1.isEmpty()) {
            time += 1;

            if (capacity + queue1.peek() <= capacities) {
                capacity += queue1.peek();
                queue2.add(queue1.poll());
            }
            else queue2.add(0);

            if (queue2.size() == bufferSize) capacity -= queue2.poll();
        }

        return time + bufferSize;
    }
}