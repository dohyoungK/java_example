public class hasRepeatedCharcter_20 {
    public static void main(String[] args) {
        System.out.println(hasRepeatedCharacter("abcdef"));
        System.out.println(hasRepeatedCharacter("abcaef"));
    }

    public static boolean hasRepeatedCharacter(String str) {
        // TODO: 입력받은 str에서 중복된 문자있는지 리턴 "abcdef"  "abadef"
        // for (0~length() str문자열)
        //    for (0~length() str문자열) 같은 인덱스가 아닐 때 글자가 같은지

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) return true;
            }
        }

        return false;
    }
}
