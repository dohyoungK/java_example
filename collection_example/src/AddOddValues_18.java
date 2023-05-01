import java.util.HashMap;

public class AddOddValues_18 {
    public static void main(String[] args) {

        HashMap<Character, Integer> hashMap = new HashMap<>(){{
            put('a', 1);
            put('b', 4);
            put('c', 6);
            put('d', 9);
        }};
        System.out.println(addOddValues(hashMap));
    }

    public static int addOddValues(HashMap<Character, Integer> hashMap) {
        //TODO.. 입력받은 HashMap의 짝수 Value를 모두 더한 값 리턴

        int result = 0;
        for (Character key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if (value % 2 == 0) result += value;
        }
//        for (Integer value : hashMap.values()) {
//            if (value % 2 == 0) result += value;
//        }

        return result;
    }
}
