import java.util.HashMap;

public class RemoveEntry_15 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>(){{
            put("a", 1);
            put("b", 2);
            put("c", 3);
        }};
        removeEntry(hashMap, "b");
        System.out.println(hashMap);
    }

    public static void removeEntry(HashMap<String, Integer> hashMap, String key) {
        //TODO.. HashMap과 Key를 입력받아
        // 해당 Key의 Entry를 제거

        hashMap.remove(key);
    }
}
