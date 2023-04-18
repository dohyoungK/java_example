public class isGreaterThan_04 {
    public static void main(String[] args) {
        System.out.println(isGreaterThan(1, 2));
        System.out.println(isGreaterThan(2, 1));
    }

    public static boolean isGreaterThan(int num1, int num2) {
        // TODO: 두번째 수가 첫번째 수보다 큰지
        boolean result;

        if (num2 > num1) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
