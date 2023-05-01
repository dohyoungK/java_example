import java.util.*;

public class GetElementOfListEntry_21 {
    public static void main(String[] args) {

        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>(){{
            put("apple", Arrays.asList("apple", "red"));
            put("banana", Arrays.asList("delicious"));
        }};
        System.out.println(getElementOfListEntry(hashMap, "apple", 1));
        System.out.println(getElementOfListEntry(hashMap, "apple", 2));
    }

    public static String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        //TODO.. List를 Value로 가지는 HashMap과 Key, 인덱스를 입력받아
        // HashMap의 Key에 해당하는 Value인 List에서 인덱스에 해당하는 요소를 리턴

        List<String> list = hashMap.get(key);
        if (index >= 0 && index < list.size()) return list.get(index);
        else return null;
    }
}
