import java.util.*;

public class Implementation_Queue_02 {
    public static void main(String[] args) {
        Implementation_Queue_02 queue = new Implementation_Queue_02();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.show());
    }

    private ArrayList<Integer> listQueue = new ArrayList<Integer>();

    public void add(Integer data) {
        listQueue.add(data);
    }

    public Integer poll() {
        if(listQueue.isEmpty()) {
            return null;
        }else {
            return listQueue.remove(0);
        }
    }

    public int size() {
        return listQueue.size();
    }

    public Integer peek() {
        if(listQueue.isEmpty()) {
            return null;
        }else {
            return listQueue.get(0);
        }
    }

    public String show() {
        return listQueue.toString();
    }

    public void clear() {
        listQueue.clear();
    }
}
