import java.util.HashMap;

public class GetValue_13 {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 1);
        hm.put("b", 2);
        hm.put("c", 3);
        System.out.println(getValue(hm, "b"));
    }

    public static Integer getValue(HashMap<String, Integer> hashMap, String key) {
        //TODO.. 키와 HashMap을 입력받아
        // 입력받은 키의 값을 리턴

        return hashMap.get(key);
    }
}
