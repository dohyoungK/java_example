public class isEvenAndGreaterThanTen_06 {
    public static void main(String[] args) {
        System.out.println(isEvenAndGreaterThanTen(12));
        System.out.println(isEvenAndGreaterThanTen(8));
    }

    public static boolean isEvenAndGreaterThanTen(int num) {
        // TODO: 수가 10보다 크고 짝수인지 확인
        boolean result;

        if (num > 10 && num % 2 == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
