import java.util.HashMap;

public class GetSize_17 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = new HashMap<>(){{
            put(1, 10);
            put(2, 20);
            put(3, 30);
        }};
        System.out.println(getSize(hashMap));
    }

    public static int getSize(HashMap<Integer, Integer> hashMap) {
        //TODO.. 입력받은 HashMap의 Entry 개수 리턴

        return hashMap.size();
    }
}
