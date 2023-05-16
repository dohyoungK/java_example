import java.util.*;

public class Implementation_Stack_01 {
    public static void main(String[] args) {

        Implementation_Stack_01 stack = new Implementation_Stack_01();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.show());
    }

    private ArrayList<Integer> listStack = new ArrayList<Integer>();

    public void push(Integer data) {
        listStack.add(data);
    }

    public Integer pop() {
        if(listStack.isEmpty()) {
            return null;
        }else {
            return listStack.remove(listStack.size() - 1);
        }
    }

    public int size() {
        return listStack.size();
    }

    public Integer peek() {
        if(listStack.isEmpty()) {
            return null;
        }else {
            return listStack.get(listStack.size() - 1);
        }
    }

    public String show() {
        return listStack.toString();
    }
    public void clear() { listStack.clear(); }
}