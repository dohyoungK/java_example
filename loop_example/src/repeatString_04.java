public class repeatString_04 {
    public static void main(String[] args) {
        System.out.println(repeatString("code", 3));
        System.out.println(repeatString("code", 0));
        System.out.println(repeatString("", 3));
    }

    public static String repeatString(String str, int num) {
        String result = "";
        // TODO: 문자열을 입력된 수만큼 반복해 리턴
        for (int i = 0; i < num; i++)   result += str;

        return result;
    }
}
