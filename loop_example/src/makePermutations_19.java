public class makePermutations_19 {
    public static void main(String[] args) {
        makePermutations("87");
    }

    public static String makePermutations(String str) {
        // TODO: 입력받은 문자열의 각 문자를 가지고 만들수있는 2자리 문자열 리턴
        // "abc" -> aa, ab, ac, ba, bb, bc,
        String result = "";
        if (str.length() == 0)  return "";

        for (int i = 0; i < str.length(); i++) {
            char firstChar = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char secondChar = str.charAt(j);
                System.out.println(firstChar);
                System.out.println(secondChar);
                result += Character.toString(firstChar) + Character.toString(secondChar) + ",";
                System.out.println(result);
            }
        }

        result = result.substring(0, str.length()-1);
        return result;
    }
}
