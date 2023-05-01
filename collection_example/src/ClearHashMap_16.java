import java.util.HashMap;

public class ClearHashMap_16 {
    public static void main(String[] args) {

        HashMap<Integer, Boolean> hashMap = new HashMap<>(){{
            put(1, true);
            put(3, false);
            put(5, true);
        }};
        clearHashMap(hashMap);
        System.out.println(hashMap);
    }

    public static void clearHashMap(HashMap<Integer, Boolean> hashMap) {
        //TODO.. 입력받은 HashMap의 모든 Entry를 제거

        hashMap.clear();
    }
}
