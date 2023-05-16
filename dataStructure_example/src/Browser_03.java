import java.util.*;

public class Browser_03 {
    public static void main(String[] args) {

        System.out.println(browserStack(new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"}, "A"));
    }

    public static ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        // TODO:
        // for (actions) action
        // if (action -1) 뒤로가기
        // if (action 1) 앞으로가기
        // else 새로운 페이지

        current.push(start);

        for (String action : actions) {
            if (action.equals("-1")) {
                if(!prevStack.empty()) {
                    nextStack.push(current.pop());
                    current.push(prevStack.pop());
                }
            }
            else if (action.equals("1")) {
                if (!nextStack.empty()) {
                    prevStack.push(current.pop());
                    current.push(nextStack.pop());
                }
            }
            else {
                nextStack.clear();
                prevStack.push(current.pop());
                current.push(action);
            }
        }

        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;
    }
}
