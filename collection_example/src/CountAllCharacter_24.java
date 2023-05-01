import java.util.HashMap;

public class CountAllCharacter_24 {
    public static void main(String[] args) {

        System.out.println(countAllCharacter("banana"));
        System.out.println(countAllCharacter(""));
    }

    public static HashMap<Character, Integer> countAllCharacter(String str) {
        //TODO.. 문자열을 입력받아
        // 문자열의 각 문자를 키로 갖는 HashMap 리턴
        // (키의 값은 해당 문자가 문자열에 등장하는 횟수)

        if (str.isEmpty()) return null;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (hashMap.containsKey(key)) hashMap.put(key, hashMap.get(key) + 1);
            else hashMap.put(str.charAt(i), 1);
        }
        return hashMap;
    }
}
