import java.util.HashMap;

public class IsContain_20 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
            put("김코딩", 20);
            put("박해커", 25);
            put("최자바", 30);
        }};
        System.out.println(isContain(hashMap, "김코딩"));
        System.out.println(isContain(hashMap, "aaa"));
    }

    public static boolean isContain(HashMap<String, Integer> hashMap, String key) {
        //TODO.. HashMap과 Key를 입력받아
        // HashMap에 Key를 포함한 Entry가 존재하는지 여부 리턴

        return hashMap.containsKey(key);
    }
}
