public class makeMultiplesOfDigit_08 {
    public static void main(String[] args) {
        System.out.println(makeMultiplesOfDigit(7));
    }

    public static String makeMultiplesOfDigit(int num) {
        // TODO:
        String result = "";

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) result += i;
        }

        return result;
    }
}
