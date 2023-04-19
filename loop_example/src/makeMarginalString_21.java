public class makeMarginalString_21 {
    public static void main(String[] args) {
        System.out.println(makeMarginalString("abc"));
    }

    public static String makeMarginalString(String str) {
        // TODO: 첫번째 for에는 1~str.length()
        // 두번째 for 0~i까지 문자열을 가져오기
        String result = "";

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) { // i = 1, j =0 f, i=2 j=0,1 fl
                result += str.charAt(j);
            }
        }

        return result;
    }
}
