import java.util.HashMap;

public class AddKeyAndValue_14 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>(){{
            put("a", 1);
            put("b", 2);
            put("c", 3);
        }};
        System.out.println(addKeyAndValue(hashMap, "d", 4));
    }

    public static HashMap<String, Integer> addKeyAndValue(HashMap<String, Integer> hashMap, String key, int value) {
        //TODO.. HashMap과 Key, Value 쌍을 입력받아
        // 키, 값 쌍이 새롭게 추가된 HashMap 리턴

        hashMap.put(key, value);
        return hashMap;
    }
}
