import java.util.*;

public class PackagingBox_04 {
    public static void main(String[] args) {

        System.out.println(paveBox(new Integer[]{5, 1, 4, 6}));
    }

    public static int paveBox(Integer[] boxes) {
        // TODO: boxes를 queue에 넣어서 하나씩 빼보면서
        // 맨 앞 사람 박스수를 확인 -> 그 뒤로 박스수 확인하면서 -> 만약 뒷사람 박스수가 맨앞사람보다 같거나 작으면 같이 빼주기

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(boxes));
        int front = queue.poll();
        int count = 1;
        int result = 0;

        while (!queue.isEmpty()) {
            int back = queue.poll();

            if (back <= front) count += 1;
            else {
                result = Math.max(result, count);
                count = 1;
                front = back;
            }
        }

        return Math.max(result, count);

    }
}
