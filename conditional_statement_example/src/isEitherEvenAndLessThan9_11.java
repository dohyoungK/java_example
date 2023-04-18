public class isEitherEvenAndLessThan9_11 {
    public static void main(String[] args) {
        System.out.println(isEitherEvenAndLessThan9(2, 3));
        System.out.println(isEitherEvenAndLessThan9(2, 12));
    }

    public static boolean isEitherEvenAndLessThan9(int num1, int num2) {
        // TODO:
        boolean result;

        if (num1 % 2 == 0 || num2 % 2 == 0) {
            if (num1 < 9 && num2 < 9) {
                result = true;
            } else {
                result = false;
            }
        } else {
            result = false;
        }

        return result;
    }
}
