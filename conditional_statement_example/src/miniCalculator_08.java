public class miniCalculator_08 {
    public static void main(String[] args) {
        System.out.println(miniCalculator(5, 3, '+'));
        System.out.println(miniCalculator(5, 3, '*'));
    }
    public static int miniCalculator(int num1, int num2, char operator) {
        // TODO: 연산자  ('+', '-', '*', '/', '%')에 맞게 두수를 연산하고 리턴
        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '%':
                result = num1 % num2;
                break;

            default:
                result = 0;
                break;
        }

        return result;
    }
}
