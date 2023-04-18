public class isGreaterThan30_02 {
    public static void main(String[] args) {
        System.out.println(isGreaterThan30(29));
        System.out.println(isGreaterThan30(30));
    }

    public static String isGreaterThan30(int temp) {
        // TODO: 입력받은 온도가 30미만이면 "덥네요", 30이상이면 "에어컨" 출력
        String result;

        if (temp < 30) {
            result = "여름이 매우 덥네요";
        } else {
            result =  "에어컨을 켜야겠다!";
        }

        return result;
    }
}
