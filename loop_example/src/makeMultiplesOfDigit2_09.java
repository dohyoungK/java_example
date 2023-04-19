public class makeMultiplesOfDigit2_09 {
    public static void main(String[] args) {
        System.out.println(makeMultiplesOfDigit2(12, 8));
    }

    public static int makeMultiplesOfDigit2(int num1, int num2) {
        //TODO:
        int result = 0;
        int temp;
        if (num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }

        for (int i = num1; i <= num2; i++) {
            if (i == 0) continue;
            if (i % 2 == 0) result += 1;
        }

        return result;
    }
}
