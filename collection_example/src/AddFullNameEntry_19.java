import java.util.HashMap;

public class AddFullNameEntry_19 {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(){{
            put("firstName", "김");
            put("lastName", "코딩");
        }};
        System.out.println(addFullNameEntry(hashMap));
    }

    public static HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        //TODO.. firstName과 lastName이 키로 들어있는 HashMap을 입력받아
        // fullName을 키로 새로운 Entry를 추가하고 HashMap 리턴

        hashMap.put("fullName", hashMap.get("firstName") + hashMap.get("lastName"));
        return hashMap;
    }
}
