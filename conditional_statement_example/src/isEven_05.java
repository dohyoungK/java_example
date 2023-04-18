public class isEven_05 {
    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(1));
    }
    public static boolean isEven(int num) {
        // TODO: 짝수 판단하기
        boolean result;

        if (num % 2 == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
