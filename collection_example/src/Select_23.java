import java.util.HashMap;

public class Select_23 {
    public static void main(String[] args) {

        String[] arr = {"a", "c", "e"};
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
            put("a", 1);
            put("b", 2);
            put("c", 3);
        }};
        System.out.println(select(arr, hashMap));
        System.out.println(hashMap);
    }

    public static HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        //TODO.. 배열과 HashMap을 입력받아
        // HashMap에 배열의 요소를 Key로 가지는 Entry만을 가지는 새로운 HashMap 리턴

        HashMap<String, Integer> result = new HashMap<>();
        for (String key : arr) {
            if (hashMap.containsKey(key)) result.put(key, hashMap.get(key));
        }
        return result;
    }
}
